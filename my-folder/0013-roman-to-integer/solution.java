class Solution {
    public int romanToInt(String s) {
        //we make a char iterator where we go through each letter.
        //we want to check if the letter has the immediate smaller letter before it
        //in order to subtract.
        //otherwise the value associated with the letter will be added to the var.

        //we can just do if loops for everything but im trying to think of a more efficient data structure.

        //I think we can implement a hashmap here. key:value
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int i = 0;

        while (i < s.length()) {
            if (i + 1 < s.length() && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                total += values.get(s.charAt(i + 1)) - values.get(s.charAt(i));
                i += 2;
            } else {
                total += values.get(s.charAt(i));
                i++;
            }
        }
        return total;
    }
}

