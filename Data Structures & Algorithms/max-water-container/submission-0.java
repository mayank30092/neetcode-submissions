class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0, j = n-1;
        int maxWater = 0;
        while(i<j){
            int max = Math.min(heights[i], heights[j]) * (j-i);
            maxWater = Math.max(max,maxWater);
            if(heights[i]<heights[j]) i++;
            else j--;
        }
        return maxWater;
    }
}
