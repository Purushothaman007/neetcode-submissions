class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1 to n
        // for(int i=0;i<nums.length;i++)
        // {
        //     int indx=Math.abs(nums[i])-1;
        //     if(nums[indx]<0) return true;
        //     nums[indx]=-nums[indx];
        // }

        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            if(set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}