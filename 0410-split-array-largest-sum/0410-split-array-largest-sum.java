class Solution {
    public int splitArray(int[] nums, int k) {
       int low=Arrays.stream(nums).max().getAsInt(); 
       int high=Arrays.stream(nums).sum(); 
       while(low<=high){
        int mid=(high+low)/2;
        if(countPartitions(nums,k,mid)<=k){
            high=mid-1;
        }
        else{
          low=mid+1;  
        }
       }
       return low;
    }
    public int countPartitions(int[] nums, int k,int subarrays){
        int count=0;
        int partitions=1;
        for(int i=0;i<nums.length;i++){
            if(count+nums[i]<=subarrays){
                count+=nums[i];
            }
            else{
                partitions++;
                count=nums[i];
            }
        }
        return partitions;
    }
}