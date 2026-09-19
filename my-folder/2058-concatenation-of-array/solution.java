class Solution {
    public int[] getConcatenation(int[] nums) {
        //we add every value of nums to ans, then if an integer is given that is greater than index we subtract nums.length+1 from the number given and do that.
        int[] ans = new int[nums.length*2];
        for (int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        for (int i = 0;i<nums.length;i++){
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}
