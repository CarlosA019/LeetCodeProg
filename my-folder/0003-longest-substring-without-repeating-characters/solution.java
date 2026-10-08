class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> hashset = new HashSet<>();
    int left = 0;
    int longestSub = 0;

    for (int right = 0; right< s.length(); right++){
        //we keep moving like the other window problem. as long as set contains the character we remove the left pointer from the set
        while (hashset.contains(s.charAt(right))) {
            hashset.remove(s.charAt(left));
            left++;
        }
        hashset.add(s.charAt(right));
        longestSub = Math.max(longestSub, right - left + 1);
    }
    return longestSub;
    }
}
