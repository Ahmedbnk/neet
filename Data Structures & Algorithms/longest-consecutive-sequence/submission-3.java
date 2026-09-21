class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int tmp = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i - 1] + 1)
                tmp ++;
            else if(nums[i] != nums[i - 1])
                tmp = 1;
            max = Math.max(max , tmp);
        }
        return max;
    }
}
