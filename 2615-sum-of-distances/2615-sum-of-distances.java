import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];

        // Step 1: Group indices by value
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: Process each group
        for (List<Integer> list : map.values()) {
            int size = list.size();
            
            // Prefix sum array
            long[] prefix = new long[size + 1];
            for (int i = 0; i < size; i++) {
                prefix[i + 1] = prefix[i] + list.get(i);
            }

            // Step 3: Calculate distances
            for (int i = 0; i < size; i++) {
                int idx = list.get(i);

                // Left contribution
                long left = (long)i * idx - prefix[i];

                // Right contribution
                long right = (prefix[size] - prefix[i + 1]) - (long)(size - i - 1) * idx;

                result[idx] = left + right;
            }
        }

        return result;
    }
}