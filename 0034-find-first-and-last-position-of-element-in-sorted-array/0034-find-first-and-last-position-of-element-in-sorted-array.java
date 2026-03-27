class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurences(nums, target);
        int last=lastOccurences(nums, target);
        return new int[]{first,last};
    }
    public int firstOccurences(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
          int mid=low+(high-low)/2;
          if(nums[mid]==target){
            ans=mid;
            high=mid-1;
          }
          else if (nums[mid]<target){
            low=mid+1;
          }
          else{
            high=mid-1;
          }
        }
        return ans;
    }
    public int lastOccurences(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
          int mid=low+(high-low)/2;
          if(nums[mid]==target){
            ans=mid;
            low=mid+1;
          }
          else if (nums[mid]<target){
            low=mid+1;
          }
          else{
            high=mid-1;
          }
        }
        return ans;
    }
}