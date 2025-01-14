class Solution {
    public void moveZeroes(int[] nums) {
        int lastnonz = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int placeh = nums[lastnonz];
                nums[lastnonz]= nums[i];
                nums[i] = placeh;

                lastnonz++;
            }

        }
    }
}
