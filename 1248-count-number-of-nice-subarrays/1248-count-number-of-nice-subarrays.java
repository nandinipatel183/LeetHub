class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> mapp=new HashMap<>();
        int oddcount=0;
        int count=0;
        mapp.put(0,1);
        for(int num:nums){
            if(num%2==1){
                oddcount++;
            }
            if(mapp.containsKey(oddcount-k)){
             count+=mapp.get(oddcount-k);
            }
            mapp.put(oddcount,mapp.getOrDefault(oddcount,0)+1);
        }
      return count;
    }
}