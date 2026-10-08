class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int top =0;
        int bottom = m-1;


        //loop for m
        while(top<=bottom){
            int middle = top+ (bottom - top)/2;

            if ((target>=matrix[middle][0])&&
            (target<=matrix[middle][matrix[middle].length-1])){ //update is they are checking the other number in that column too the one at the end
                //binary search through n
                int left =0;
                int right = matrix[middle].length-1;
                while (left<=right){
                    int mid = left+(right-left)/2;
                    if (target==matrix[middle][mid]){ //matrix[middle][mid] not just mid
                        return true;
                    }
                    if (target> matrix[middle][mid]){
                        left = mid+1;
                    }
                    if (target< matrix[middle][mid]){
                        right = mid-1;
                    }
                }
                return false;
            }
            //if too big
            if (target > matrix[middle][matrix[middle].length-1]){
                top = middle +1;
            }
            //if too small
            else if (target < matrix[middle][0]){
                bottom = middle -1;
            }

        }
        return false;

    }
}
