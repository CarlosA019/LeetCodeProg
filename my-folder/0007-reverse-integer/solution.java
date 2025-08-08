class Solution {
    public int reverse(int x) {
        int temp = x;
        long reversed =0;
        while (temp != 0){
            int lastnum = temp %10;
            reversed= (reversed*10) + lastnum;
            temp = temp/10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
            return (int) reversed;
        }
}
