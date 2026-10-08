class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        //ok so for this particular problem we want to have a sliding window of k elements. we check one b one as the window moves we add the next element but are also forced to drop the previous element. To make sure we have the largest sum we have a variable
        double currentSum =0;
        double largestSum =0;
        
        //now we can loop through the firt few elements until k
        for (int i=0; i < k; i++){
            currentSum += nums[i];
            largestSum = currentSum;
        }

        //now we update the window
        for (int i=k; i<nums.length; i++){
            currentSum = currentSum + nums[i] - nums[i-k];
            largestSum = Math.max(largestSum,currentSum);
        }
        return largestSum/k;
    }
}
