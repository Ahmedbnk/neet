class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++)
        {
            int toFind = target - numbers[i];
            if(map.containsKey(toFind))
                return(new int[]{map.get(toFind) + 1, i + 1});
            else
                map.put(numbers[i], i);
        }
        return (new int[]{});
    }
}
