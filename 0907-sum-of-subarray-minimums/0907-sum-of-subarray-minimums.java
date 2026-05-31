class Solution {
     private int[] findNSE(int[] arr){
            int n=arr.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
            }
            return ans;
         }
          private int[] findPSSE(int[] arr){
            int n=arr.length;
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
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

    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long mod = 1000000007L;

        int left[]=findPSSE(arr);
        int right[]=findNSE(arr);

        long sum=0;

        for(int i=0;i<n;i++){
        long leftc=i-left[i];
        long rightc=right[i]-i;
        long ans= (long) arr[i]*leftc * rightc ;

        sum=(sum+ans)%mod;
        }
        return (int)sum;
    }
}