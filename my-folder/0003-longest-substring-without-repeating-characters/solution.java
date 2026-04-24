class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> h = new HashSet<>();
    int lp = 0;
    int maxL = 0;

    for (int rp = 0; rp< s.length(); rp++){
        //we are running the pushing pattern 
        //now what is the locgic that will accept or keep the window pushing? 
        //if the set contains the next char then lets erase one from the back. and we can add to the left pointer. otherwise lets push the right one
        while (h.contains(s.charAt(rp))) {
            h.remove(s.charAt(lp));
            lp++;
        }
        h.add(s.charAt(rp));
        maxL = Math.max(maxL, rp - lp + 1);
    }
    return maxL;
    }
}
