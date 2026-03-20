class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        int mini=n/3+1;
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        
        if(m.get(nums[i])==mini){
            result.add(nums[i]);
        }
        if(result.size()==2)break;
        }
        return result;
    }
}