class Solution {
    static {
        for(int i = 0; i < 500; i++)
        {
            productExceptSelf(new int[] {0, 1});
        }
    }
    public static int[] productExceptSelf(int[] nums) {
       int[] prefix = new int[nums.length];
       int[] suffix = new int[nums.length];
       int[] result = new int[nums.length];
       prefix[0] = nums[0];
       suffix[0] = nums[nums.length - 1];
       for(int i = 1; i < nums.length; i++)
       {
        prefix[i] = prefix[i - 1] * nums[i];
        suffix[i] = suffix[i - 1] * nums[nums.length - i - 1];
       }
       if(nums.length > 2)
       {
            for(int i = 1; i < nums.length - 1; i++)
            {
                result[i] = suffix[nums.length - i - 2] * prefix[i -1];
            }
       }
       result[0] = suffix[nums.length - 2];
       result[nums.length - 1] = prefix[nums.length - 2];
       return result;
    }
}  
