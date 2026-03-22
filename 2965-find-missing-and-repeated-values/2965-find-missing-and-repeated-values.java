class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            int value=grid[i][j];
            map.put(value,map.getOrDefault(value,0)+1);
         }
        }
        int missing=-1;
        int repeated=-1;
        for(int i=1;i<=n*n;i++){
            if(!map.containsKey(i)){
                missing=i;
            }
            else if(map.get(i)==2){
                repeated=i;
            }
        }
        
        return new int[]{repeated,missing};
    }
}