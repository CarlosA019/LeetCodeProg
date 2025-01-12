class Solution {
    public String mergeAlternately(String word1, String word2) {
        int iterNum = Math.max(word1.length(),word2.length());
        String answer = "";

        for (int i = 0;i<iterNum;i++){
            if (i<word1.length()){
            answer += word1.charAt(i);}
            if (i<word2.length()){
            answer += word2.charAt(i);}
        }
        return answer;
    }
}
