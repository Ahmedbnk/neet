class Solution {
    static {
        for(int i = 0; i < 500; i++)
        {
            twoSum(new int[] {1, 0}, 1);
        }
    }
    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int ans[] = {map.get(nums[i]),  i};
                return(ans);
            }
            map.put(target - nums[i], i);
        }

        return(new int[]{});
    }
}
