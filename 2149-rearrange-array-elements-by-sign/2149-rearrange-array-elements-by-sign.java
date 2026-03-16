class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int[] arr=new int[nums.length];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            arr1[p++]=nums[i];
            }
            else if(nums[i]<0){
            arr2[n++]=nums[i];
            }
        }
        for(int i=0;i<nums.length/2;i++){
            arr[2*i]=arr1[i];
           arr[2*i+1]=arr2[i];
        }
 
       return arr;
    }
}