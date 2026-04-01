class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int low=0;
       int n=matrix.length;
       int m=matrix[0].length;
       int high=n*m-1;
       while(low<=high){
        int mid=(low+high)/2;
        int rows=mid/m;
        int cols=mid%m;
        if(matrix[rows][cols]==target){
            return true;

        }else if(matrix[rows][cols]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return false;
    }
}