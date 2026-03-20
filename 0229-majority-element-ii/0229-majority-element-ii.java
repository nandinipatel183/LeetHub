class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int count1=0;
        int count2=0;
        int el1=Integer.MAX_VALUE;
        int el2=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
        if(count1==0 && el2!=nums[i] ){
            count1=1;
            el1=nums[i];
        }
        else if(count2==0 && el1!=nums[i] ){
            count2=1;
            el2=nums[i];
        }
        else if(nums[i]==el1){
            count1++;
        }
        else if(nums[i]==el2){
            count2++;
        }
        else{
            count1--;
            count2--;
        }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1)count1++;
            if(nums[i]==el2)count2++;
        }
        int mid=n/3+1;
        if(count1>=mid)result.add(el1);
        if(count2>=mid)result.add(el2);

        return result;
    }
}