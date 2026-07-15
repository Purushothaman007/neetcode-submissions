class Solution {
     public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int [] dp =new int[n];
        Arrays.fill(dp,-1);
        int case1=solve(nums,0,n-2,dp);
        Arrays.fill(dp,-1);
        int case2=solve(nums,1,n-1,dp);
        return Math.max(case1,case2);
    }
    public static int solve(int [] nums,int i,int n,int [] dp)
    {
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+solve(nums,i+2,n,dp);
        int not_take=solve(nums,i+1,n,dp);
        return dp[i]=Math.max(take,not_take);
    }
}
