class Solution {
    int [] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        return Math.min(solve(cost,0),solve(cost,1));
    }

    public int solve(int []cost,int i)
    {
        if(i>=cost.length) return 0;
        if(dp[i]!=0) return dp[i];
        int one=cost[i]+solve(cost,i+1);
        int two=cost[i]+solve(cost,i+2);

        return dp[i]=Math.min(one,two);
    }
}
