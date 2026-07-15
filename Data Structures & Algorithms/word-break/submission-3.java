class Solution {
    HashSet<String> word;
    Boolean [] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        word=new HashSet<>(wordDict);
        dp = new Boolean[s.length()];
        return dfs(s,0);
    }

    boolean dfs(String s,int i){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i;j<s.length();j++)
        {
            if(word.contains(s.substring(i,j+1)))
            {
                if(dfs(s,j+1)) return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
     
}
