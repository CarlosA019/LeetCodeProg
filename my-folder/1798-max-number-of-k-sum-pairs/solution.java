class Solution {
    public int maxOperations(int[] nums, int k) {
        //ok this is two sum with an extra step so we find what numbers are equal to the target number but we keep going until there is no more... can we sort this array? if we sort then we can efficiently move the two pointers. 
        int kpairs =0;
        int left = 0;
        int right = nums.length-1;

        Arrays.sort(nums);
        if (nums.length==0){
            kpairs =0;
        }

        while (left<right){
            if (nums[right] + nums[left]==k){
                kpairs++;
                right--;
                left++;
            }else if(nums[right]+nums[left]>k){
                right--;
            }else{
                left++;
            }
        }
        return kpairs;
    }
}
