class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        HashMap<Integer,Integer> SumMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(SumMap.containsKey(complement)){
               return new int[]{SumMap.get(complement),i};
            }
            SumMap.put(nums[i],i);
        }
        return new int[]{-1, -1};
    }
}