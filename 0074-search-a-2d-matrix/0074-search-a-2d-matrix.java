class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      for(int i=0;i<n;i++){
        if(matrix[i][0]<=target && matrix[i][m-1]>=target){
            return binarysearch(matrix[i],target);
        }
      } 
      return false;
          
    }
    public boolean binarysearch(int[] rows, int target){
     int low=0;
     int high=rows.length-1;
     while(low<=high){
        int mid=(low+high)/2;
        if(rows[mid]==target){
            return true;
        }
        else if(rows[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }

        
     }
     return false;
    }
}