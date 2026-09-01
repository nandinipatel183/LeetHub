class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mapp=new HashMap<>();
        int count=0;
        int sum=0;
        mapp.put(0,1);
        for(int num:nums){
         sum+=num;
        if(mapp.containsKey(sum-goal)){
            count+=mapp.get(sum-goal);
        }
        mapp.put(sum,mapp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}