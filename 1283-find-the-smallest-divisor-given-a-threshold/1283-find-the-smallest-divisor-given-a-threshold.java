class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n>threshold)return -1;
        for(int num:nums){
           max=Math.max(max,num);
        }
        int low=1;
        int high=max;
        int ans=0;
       while(low<=high){
       int mid=low+(high-low)/2;
        int sum=0;
       for(int num:nums){
        sum+=(int)Math.ceil((double)num/mid);
       }
       if(sum<=threshold){
        ans=mid;
        high=mid-1;
       }
       else{
        low=mid+1;
       }
       }
        return ans;
    }
}