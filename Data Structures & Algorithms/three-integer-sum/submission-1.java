class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> set = new HashSet<>();
       Arrays.sort(nums);
       for(int i = 0; i < nums.length; i++)
       {
            int target = - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r)
            {
                if( target > nums[l] + nums[r])
                    l++;
                else if(target < nums[l] + nums[r])
                    r--;
                else if(target == nums[l] + nums[r])
                {
                    set.add(new ArrayList<>(Arrays.asList(-target, nums[l], nums[r])));
                    l++;
                    r--;
                }
            }
       }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
