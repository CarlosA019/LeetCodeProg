class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCons = 0;
        int currentCons = 0;
        int zerosFlipped = 0;
        int left = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCons++;
            }
            if (nums[i] == 0) {
                currentCons++;
                zerosFlipped++;
            }

            // shrinking window
            while (zerosFlipped > k) {
                if (nums[left] == 0) {
                    zerosFlipped--;
                }
                currentCons--;
                left++;
            }
            maxCons = Math.max(maxCons, currentCons);
        }
        return maxCons;
    }
}
