class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l=0;
        int r=n-1;
        int l_max=h[l];
        int r_max=h[r];
        int ans=0;
        while(l<r)
        {
            if(h[l]>h[r])
            {
                
                r_max=Math.max(r_max,h[r]);
                ans+=r_max-h[r];
                r--;
            }
            else
            {
                l_max=Math.max(l_max,h[l]);
                ans+=l_max-h[l];
                l++;
            }
        }
        return ans;
    }
}
