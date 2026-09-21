class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;
        int smaller = 0;
        int tmpArea = 0;
        while(l < r)
        {
            smaller = Math.min(heights[l], heights[r]);
            tmpArea = smaller * (r - l);
            maxArea = Math.max(maxArea, tmpArea);
            if(heights[l] <= heights[r])
                l++;
            else
                r --;
        }
        return maxArea;
    }
}
