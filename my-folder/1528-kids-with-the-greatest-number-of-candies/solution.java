class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mostCandies = 0;
        //making a new ARRAY LIST
        List<Boolean> result = new ArrayList<>();

        //first we want to check what the biggest number in array is
        for (int i =0; i <candies.length;i++){
            if (candies[i]>mostCandies){
                mostCandies = candies[i];
                }
        }
        //then we make a loop to give us the array of true or false
        for (int i =0; i<candies.length;i++){
            if (candies[i] + extraCandies >=mostCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
