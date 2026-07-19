class Solution {
    String dp[][];
    public String longestPalindrome(String s) {
        dp=new String[s.length()][s.length()];
        return solve(s,0,s.length()-1);
    }
    public String solve(String s,int l,int r)
    {
        if(l>r) return "";
        if(l==r) return dp[l][r]=s.substring(l,l+1);
        if(dp[l][r]!=null) return dp[l][r];
        if(s.charAt(l)==s.charAt(r))
        {
            String sub=solve(s,l+1,r-1);
            if(sub.length()==r-l-1)
            {
                return s.charAt(l)+sub+s.charAt(r);
            }
        }

        String op1=solve(s,l+1,r);
        String op2=solve(s,l,r-1);

        return dp[l][r]=(op1.length()>op2.length())? op1:op2;
    }
}
