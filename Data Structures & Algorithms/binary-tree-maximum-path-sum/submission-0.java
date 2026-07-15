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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }
     public int getmax(TreeNode root)
    {
        if(root==null) return 0;
        int left=getmax(root.left);
        int right=getmax(root.right);
        int path=root.val+Math.max(left,right);
        return Math.max(0,path);
    }
    public void dfs(TreeNode root)
    {
        if(root==null) return ;
        int left=getmax(root.left);
        int right=getmax(root.right);
        ans=Math.max(ans,root.val+left+right);
        dfs(root.left);
        dfs(root.right);
    }
   
}
