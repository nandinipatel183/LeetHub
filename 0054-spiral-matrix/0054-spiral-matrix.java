class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int startcol=0;
        int startrow=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                arr.add(matrix[startrow][j]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                  arr.add(matrix[i][endcol]);
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                arr.add(matrix[endrow][j]);
            }
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                arr.add(matrix[i][startcol]);
               
            }
               startrow++;
                startcol++;
                endrow--;
                endcol--;
                
        }
        return arr;
    }
}