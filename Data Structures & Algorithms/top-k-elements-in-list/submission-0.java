class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        k--;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer n : nums)
        {
            if(!map.containsKey(n))
                map.put(n, 1);
            else
                map.put(n, map.get(n) + 1);
        }

        int key = 0;
        while(k >= 0)
        {
            int max = Integer.MIN_VALUE;
            for(Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(entry.getValue() > max)
                {
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            map.remove(key);
            result[k] = key;
            k--;
        }
        return result;
    }
}
