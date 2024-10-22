        //we need a loop to check if i is equal to any number in that array
        //we can probably use the HasMaps thing to store a value and make it so that we can check later if there is a value the same.

        //inside that loop we must do a k++ counter

        //at the end we make a new array with only the non eliminated numbers.
        //so i guess add if i != j

  class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> uniqueMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            uniqueMap.put(nums[i], i);
        }

        int k = uniqueMap.size();

        int index = 0;
        for (int key : uniqueMap.keySet()) {
            nums[index++] = key;
        }
        Arrays.sort(nums, 0, k);

        return k;
    }
}
