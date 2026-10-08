class Solution {
    public int maxVowels(String s, int k) {
        //another moving window problem. we want to make sure we stay at k 
        //we want to keep count of max amount of vowels that we have seen
        //no need to edit anything or use a different datastucture i think since no need to track any indexes
        //so we can loop through the first loop of string of k
        int maxVowels =0;
        int currentVowels =0;
        for (int i = 0; i<k; i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                currentVowels++;
                maxVowels = currentVowels;
            }
        }
        //then we can add one or loose one
        for (int i=k; i<s.length(); i++){
            //current = +1 -1;
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                currentVowels++;
            }
            if (s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels,currentVowels);
        }
        return maxVowels;
    }
}
