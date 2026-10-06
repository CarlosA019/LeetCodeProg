class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //log n already tells me to use a datastructure. lets imagine this is a binary //search xcept i dont yet know what im looking for so i can take the array, order it. //get the last index and that should be the biggest number. now i can do a binary //search and check for that.
        int Left = 0;
        int Right = arr.length-1;
        
        while (Left<Right){
            int Middle = Left + (Right-Left)/2;
            
            if (arr[Middle] < arr[Middle+1]){
                Left = Middle+1;
            }else{
                Right = Middle;
            }
        }
        return Left;
    }
}
