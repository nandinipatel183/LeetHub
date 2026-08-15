class Solution {
    public int maxArea(int[] height) {
         int n=height.length;
         int left=0;
         int maxarea=0;
         int right=height.length-1;
         for(int i=0;i<n;i++){
            int width=right-left;
            int heights=Math.min(height[left],height[right]);
            maxarea=Math.max(maxarea,width*heights);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
         }
         return maxarea;
         }
}