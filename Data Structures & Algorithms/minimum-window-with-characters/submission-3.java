class Solution {
    public String minWindow(String s, String t) {
        
        if(t.length() > s.length()) return "";
        int start=Integer.MAX_VALUE;
        int minlen=Integer.MAX_VALUE;

        int left=0;

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> win = new HashMap<>();

        int need=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            win.put(c,win.getOrDefault(c,0)+1);
            
            if(map.containsKey(c) && map.get(c)==win.get(c))
            {
               need++;
            }

            while(need==map.size())
            {
                if(right-left+1 < minlen)
                {
                    minlen=right-left+1;
                    start=left;
                }
                char ch=s.charAt(left);
                win.put(ch,win.get(ch)-1);
                if(map.containsKey(ch) && win.get(ch) < map.get(ch)) need--;
                left++;
            }
        }
        return start==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
