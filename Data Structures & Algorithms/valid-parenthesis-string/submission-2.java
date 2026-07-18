class Solution {
    Boolean [][] memo;
    public boolean checkValidString(String s) {
        memo=new Boolean[s.length()][s.length()];
        return solve(s,0,0);
    }

    public boolean solve(String s,int op,int i)
    {
        if(op<0) return false;
        if(i==s.length())
        {
            if(op==0) return true;
            return false;
        }
        if(memo[i][op]!=null) return memo[i][op];
        if(s.charAt(i)=='(')
        {
            return solve(s,op+1,i+1);
        } 
        else if(s.charAt(i)==')') 
        {
            return solve(s,op-1,i+1);
        }
        else
        {
        return memo[i][op]=solve(s,op+1,i+1) || solve(s,op-1,i+1) || solve(s,op,i+1);
        }
    }
}
