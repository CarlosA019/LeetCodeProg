class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> stackmap = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            stackmap.put( s.charAt(i), stackmap.getOrDefault( s.charAt(i), 0)+1);
        }
        //now we want to check the other word
        //we loop through t
        for (int i =0; i<t.length(); i++){
            if (!stackmap.containsKey(t.charAt(i))){
                return false;
            }
            stackmap.put (t.charAt(i), stackmap.get(t.charAt(i))-1);

            if(stackmap.get(t.charAt(i)) == 0){
                stackmap.remove(t.charAt(i));
            }
        }

        return stackmap.isEmpty();

    

    }
}
