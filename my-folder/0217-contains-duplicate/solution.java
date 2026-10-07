class Solution {
    public boolean containsDuplicate(int[] nums) {
        //order array and loop through if neext == current then it is doubled.

        Arrays.sort(nums);
        for (int i = 0; i< nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        
    }
}
