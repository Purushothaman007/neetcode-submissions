class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
                int sum=nums[l]+nums[r]+nums[i];
                if(sum==0)
                {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])l++;
                    while(r>l && nums[r]==nums[r+1])r--;
                }
                else if(sum<0)
                {
                 l++;
                }
                else
                {
                 r--;
                }
            }
        }
        return ans;
    }
}
