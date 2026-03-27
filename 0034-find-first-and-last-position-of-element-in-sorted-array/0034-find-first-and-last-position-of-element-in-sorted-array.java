class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurences(nums, target);
        int last=lastOccurences(nums, target)-1;

         if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first,last};
    }
    public int firstOccurences(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
          int mid=low+(high-low)/2;
         
          if (nums[mid]>=target){
             ans=mid;
             high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return ans;
    }
    public int lastOccurences(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
          int mid=low+(high-low)/2;
    
          if (nums[mid]>target){
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