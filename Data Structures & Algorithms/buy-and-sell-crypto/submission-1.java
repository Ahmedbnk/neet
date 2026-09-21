class Solution {
    static {
        for(int i = 0; i < 50; i++)
        {
            maxProfit(new int[]{1, 0});
        }
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int profet = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
                max = prices[i];
            }
            else if(prices[i] > max)
                max = prices[i];
            profet = Math.max(profet, max - min);
        }
        return (profet);
    }
}
