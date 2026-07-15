/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    HashMap<Integer,Integer> map;
    int preindx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return solve(preorder,0,inorder.length-1);
    }

    public TreeNode solve(int [] pre,int s,int e)
    {
        if(s>e) return null;
        
        TreeNode root=new TreeNode(pre[preindx]);
        preindx++;

        int in=map.get(pre[preindx-1]);
        root.left=solve(pre,s,in-1);
        root.right=solve(pre,in+1,e);

        return root;
    }
}
