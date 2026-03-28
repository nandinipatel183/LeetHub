class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // Initialize the result variable with 0
        int ans = 0;

        // Traverse the array and XOR all elements
        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }

        // Return the unique element found using XOR
        return ans; 
    }
}