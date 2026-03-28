class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        if((double)m*k>n)return -1;
        for(int day:bloomDay){
            high=Math.max(high,day);
            low=Math.min(low,day);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
        
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canMake(int[]bloomDay,int day,int m,int k){
        int bouquets=0;
        int count=0;

        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
                }else{
                    count=0;
                }
            
        }
        return bouquets>=m;
    }
}