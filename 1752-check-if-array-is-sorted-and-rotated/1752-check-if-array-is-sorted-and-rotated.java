class Solution {

    public boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int rotated(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count;
    }

    public boolean check(int[] nums) {

        if (isSorted(nums)) {
            return true;
        }

        if (rotated(nums) == 1) {
            return true;
        }

        return false;
    }
}