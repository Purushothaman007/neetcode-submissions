class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans=new ArrayList<>();
        solve(new ArrayList<>(),nums,target,0);
        return ans;
    }
    public void solve(List<Integer> list,int [] nums,int target,int i){
    
    if(target==0)
    {
        ans.add(new ArrayList<>(list));
        return;
    }
    if(i>=nums.length || target<0) return;
    
    list.add(nums[i]);
    solve(list,nums,target-nums[i],i);
    list.remove(list.size()-1);

    solve(list,nums,target,i+1);
    }

}
