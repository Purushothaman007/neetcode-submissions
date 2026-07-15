class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        Set<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            if(!set.isEmpty() && set.contains(s.charAt(right)))
            {
                while(left<s.length() && set.contains(s.charAt(right)))
                {
                     set.remove(s.charAt(left));
                     left++;
                }
            }
            set.add(s.charAt(right));
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
