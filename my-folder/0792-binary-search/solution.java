class Solution {
    public int search(int[] nums, int target) {
        //ok so we want to make two pointers and avoid overflow
        //the left pointer is goint to start at 0 and the right at the end
        //middle is going to be l+(r-l)/2 which should handle the overflow in java
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int middle = left + (right-left)/2;
            if (target == nums[middle]){
                return middle;
            }
            else if (target > nums[middle]){
                left = middle + 1;
            }
            else right = middle -1;
        }
        return -1;
    }
}
