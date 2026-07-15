class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length() > s.length()) return "";
        int start=Integer.MAX_VALUE;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<=s.length()-t.length();i++)
        {
          HashMap<Character,Integer> map = new HashMap<>();
          for(char c:t.toCharArray())
          {
            map.put(c,map.getOrDefault(c,0)+1);
          }
          int cnt=0;
          for(int j=i;j<s.length();j++)
          {
            char c=s.charAt(j);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0)
                   cnt++;
            }
            if(cnt==t.length())
            {
                if(j-i+1<minlen)
                {
                    minlen=j-i+1;
                    start=i;
                }
            }
          }
        }

        return start==Integer.MAX_VALUE ? "":s.substring(start,start+minlen);
    }
}
