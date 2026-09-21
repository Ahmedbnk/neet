class Solution {

    public int trap(int[] height) {
        if(height.length < 2)
            return(0);
       int volume = 0;
       int l = 0; 
       int r = height.length  - 1;
       while(l < r && (height[l] == 0 || height[l] <= height[l + 1]))
        l++;
       while(l < r && (height[r] == 0 || height[r] <= height[r - 1]))
        r--;
        while(l < r - 1)
        {
            if(height[l] <= height[r])
            {
                if(height[l] > height[l + 1])
                {
                    volume += height[l] - height[l + 1];
                    height[l + 1] = height[l];
                }
                l++;
            }
            else
            {
                if(height[r] > height[r - 1])
                {
                    volume += height[r] - height[r - 1];
                    height[r - 1] = height[r];
                }
                r--;
            }
        }
        return volume;
    }
}
