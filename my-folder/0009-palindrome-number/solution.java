class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int reversed = 0;
        int og = x;
        while (x>0){
            int lastint = x % 10;
            reversed = (reversed*10) + lastint;

            //now remove last int from x
            x= x/10;
        }
        if (og == reversed){
            return true;
        }else{
            return false;
        }
    }
}
