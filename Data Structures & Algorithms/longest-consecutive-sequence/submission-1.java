class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)set.add(n);
        int ans=0;
        for(int n:nums)
        {
            int cnt=0;
            if(!set.contains(n-1))
            {
                while(set.contains(n++)) cnt++;
            }
            ans=Math.max(ans,cnt);
        }
        return ans; 
    }
}
