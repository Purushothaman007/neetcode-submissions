class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=0;
        for (int n : nums) {
            set.add(n);
        }
        for(int n:set)
        {   
            int num=n;
            
            if(!set.contains(num-1))
            {
                int cnt=0;
                while(set.contains(num))
                {
                    cnt++;
                    num=num+1;
                }  
                ans=Math.max(ans,cnt);  
            }
            
        }
        return ans;
    }
}
