class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
           return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    public int atMostK(int[] nums, int k){
        int maxcount=0;
        int left=0;
        HashMap<Integer,Integer> mapp=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            mapp.put(nums[right], mapp.getOrDefault(nums[right], 0) + 1);
            if(mapp.get(nums[right])==1){
                k--;
            }
            while(k<0){
              mapp.put(nums[left], mapp.getOrDefault(nums[left], 0) - 1);
             if(mapp.get(nums[left])==0){
                k++;
            }
            left++;
            }
            maxcount+=right-left+1;   
        }
        return maxcount;
    }
}