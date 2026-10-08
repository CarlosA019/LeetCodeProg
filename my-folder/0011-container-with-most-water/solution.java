class Solution {
    public int maxArea(int[] height) {
        int largestArea=0;
        int left =0;
        int right = height.length-1;

        if (height.length<2){
            largestArea = 0;
        }
        
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right-left);
            largestArea = Math.max(largestArea, area);

            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return largestArea;

    }
}
