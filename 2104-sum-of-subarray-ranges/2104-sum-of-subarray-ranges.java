class Solution {
     private int[] NSE(int[] nums){
            int n=nums.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=n;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(i);
            }
            return ans;
        }
    private int[] NGE(int[] nums){
            int n=nums.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=n;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(i);
            }
            return ans;
        }

    private int[] PSEE(int[] nums){
            int n=nums.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(i);
            }
            return ans;
        }
     private int[] PGEE(int[] nums){
            int n=nums.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(i);
            }
            return ans;
        }
    private long sumSubarrayMins(int[] nums) {
        int n = nums.length;
        int[] nse =NSE(nums);
        int[] psee = PSEE(nums);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = 1L * left * right;
            sum += freq * nums[i];
        }
        return sum;
    }
    private long sumSubarrayMaxs(int[] nums) {
        int n = nums.length;
        int[] nge = NGE(nums);
        int[] pgee = PGEE(nums);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = 1L * left * right;
            sum += freq * nums[i];
        }
        return sum;
    }


    public long subArrayRanges(int[] nums) {
       return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }
}