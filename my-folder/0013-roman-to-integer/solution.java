class Solution {
    public int romanToInt(String s) {
        //we make the hashmap 
        int result = 0;
        Map<Character,Integer> rm = new HashMap<>();
        rm.put('I',1);
        rm.put('V',5);
        rm.put('X',10);
        rm.put('L',50);
        rm.put('C',100);
        rm.put('D',500);
        rm.put('M',1000);

        //now we read the integer
        for (int i=0;i<s.length();i++){
            int value = rm.getOrDefault(s.charAt(i),0);

            if (i + 1 < s.length() && rm.get(s.charAt(i + 1)) > rm.get(s.charAt(i))) {
                result -= rm.get(s.charAt(i));
            } else {
                result += rm.get(s.charAt(i));
            }

        }
        return result;
        
    }
}
