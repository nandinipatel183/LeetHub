class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] arr=new int[l];
        int n=1;
        int p=0;
        for(int i=0;i<l;i++){
            if(nums[i]<0){
                arr[n]=nums[i];
                n+=2;
            }
            else{
               arr[p]=nums[i];
                p+=2;
            }
        }
        return arr;
    }
}