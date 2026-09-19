class Solution {
    public int[] shuffle(int[] nums, int n) {
        //lets make a new array to hold the updated list. then we can loop through until half and add them in +2 index order then same thing for another loop but starting at index 1 insted of 0
        int[] updatedArr = new int[nums.length];
        for (int i = 0; i<n; i++){
            updatedArr[i*2] = nums[i];
        }
        for (int i = n; i<nums.length; i++){
            updatedArr[(i-n)*2+1] = nums[i];
        }
        return updatedArr;

        
    }
}
