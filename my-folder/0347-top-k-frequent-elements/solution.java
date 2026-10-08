class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            count.put(nums[index], count.getOrDefault(nums[index], 0) + 1);
        }

        // Step 2: Create a bucket where index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int index = 0; index < nums.length + 1; index++) {
            bucket[index] = new ArrayList<>();
        }

        for (int num : count.keySet()) {
            int freq = count.get(num);   // e.g., num=1 → freq=3
            bucket[freq].add(num);       // put 1 into bucket[3]
        }

        int[] result = new int[k];
        int resultIndex = 0;
        for (int index = bucket.length - 1; index >= 0; index--) {
            // Skip buckets that have no elements with this frequency
            if (bucket[index].size() == 0) {
                continue;
            }
            // Add all elements from this frequency bucket into our result
            for (int innerIndex = 0; innerIndex < bucket[index].size(); innerIndex++) {
                result[resultIndex] = bucket[index].get(innerIndex);
                resultIndex++;
                // We only need k elements, so return as soon as we have enough
                if (resultIndex == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
