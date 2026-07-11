class Solution {
    public void func(int ind,int target,int[] candidates,List<Integer> current,List<List<Integer>> ans) {
        int n=candidates.length;
        if(ind==n){
            if(target==0){
            ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(candidates[ind]<=target){
        current.add(candidates[ind]);
        func(ind,target-candidates[ind],candidates,current,ans);
        current.remove(current.size()-1);
        }
        func(ind+1,target,candidates,current,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        func( 0,target,candidates, new ArrayList<>(),ans);
        return ans;
    }
}