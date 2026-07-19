class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int ans=Integer.MIN_VALUE;
        int n=heights.length;

        for(int i=0;i<n;i++)
        {
            int len=heights[i];
            for(int j=i;j<n;j++)
            {
                len=Math.min(len,heights[j]);
                ans=Math.max(ans,len*(j-i+1));
            }
        }

        return ans;
    }
}
