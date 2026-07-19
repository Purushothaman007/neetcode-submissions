class Solution {
    public int[] twoSum(int[] num, int t) {
        int l=0;
        int r=num.length-1;

        while(l<r)
        {
            if(num[l]+num[r]==t)
            {
                return new int[]{l+1,r+1};
            }
            else if(num[l]+num[r]>t)
            {
                r--;
            }
            else
            {
                l++;
            }
        }

        return new int[]{-1,-1};
    }
}
