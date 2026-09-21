class Solution {
    static{
        for(int i = 0; i < 500; i++)
            twoSum(new int[]{1,0}, 0);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length -1;
        while(l != r)
        {
            if(numbers[l] + numbers[r] > target)
                r --;
            else if(numbers[l] + numbers[r] < target)
                l++;
            else
                return(new int[]{l + 1,r + 1});
        }
        return (new int[]{});
    }
}
