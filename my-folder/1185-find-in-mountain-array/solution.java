/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //can i simply implement a normal binary if the middle is bigger than the target then we can choose to continue otherwise we know it cannot be there.
        //if it is there then we can go a normal binary search with left check first then right check after.
        
        int left = 0;
        int right = mountainArr.length()-1;
        int peak = 0;
        
        while (left<right){
            int middle = left +(right-left)/2;
            //we can find peak then move around it?
            if (mountainArr.get(middle)<mountainArr.get(middle+1)){
                left = middle+1;
            }else{
            right= middle;
            }
        }
        peak = left;
        
        //now we check the left 
        left = 0;
        right = peak;
        while (left<=right){
            int middle = left +(right-left)/2;
            if (target == mountainArr.get(middle)){
                return middle;
            }else if (target < mountainArr.get(middle)){
                right = middle-1;
            }else{
                left = middle + 1;
            }
        }
        
        //now we check the right might you this one is descending
        left = peak;
        right = mountainArr.length()-1;
        while (left<=right){
            int middle = left +(right-left)/2;
            if (target == mountainArr.get(middle)){
                return middle;
            }else if (target < mountainArr.get(middle)){
                left = middle + 1;
            }else{
                right = middle -1;
            }
        }
        
    return -1;
        
    }
}
