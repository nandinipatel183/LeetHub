class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=Arrays.stream(weights).max().getAsInt();
       int high=Arrays.stream(weights).sum();
       while(low<=high){
        int mid=low+(high-low)/2;
       int loadDays=loadDays(weights,days,mid);
        if(loadDays<=days){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return low;
    }
    public int loadDays(int[] weights, int days,int capacity){
        int load=0;
        int mdays=1;
        for(int w:weights){
            if(w+load>capacity){
                mdays++;
                load=w;
            }
            else{
                load+=w;
            }
        }
        return mdays;
    }
}