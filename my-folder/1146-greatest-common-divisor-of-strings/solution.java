class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    
    private int gcd(int int1, int int2) {
        while (int2 != 0) {
            int temp = int2;
            int2 = int1 % int2;
            int1 = temp;
        }
        return int1;
    }
}

