class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        //two pointer one moves slow and one is in the loop

        for (int j =0 ; j < t.length(); j++) { 
            if (i<s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        if (i == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}
