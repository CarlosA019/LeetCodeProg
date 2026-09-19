class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //we make a counter for how many ones. if new one is also is a 1 then add another. otherwise stop
        //loop through and add conditional if number at index i+1 is a one as well then add to counter.
        int counter = 0;
        int maxC = 0;
        for (int i =0; i<nums.length; i++){
            if (nums[i]==1){
                counter++;
            }else{counter=0;}
            if (counter>maxC){
                maxC=counter;
            }
        }
        return maxC;
    }
}
