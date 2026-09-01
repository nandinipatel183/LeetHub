class Solution {
    public int characterReplacement(String s, int k) {
    
        // Frequency array for A-Z
        int[] freq = new int[26];

        // Left and right pointers
        int left = 0;
        int right = 0;

        // Frequency of the most frequent character
        int maxCount = 0;

        // Maximum valid window length
        int maxLength = 0;

        while (right < s.length()) {

            // Add current character to frequency
            freq[s.charAt(right) - 'A']++;

            // Update maximum frequency
            maxCount = Math.max(
                maxCount,
                freq[s.charAt(right) - 'A']
            );

            // Number of characters that need replacement
            int replace = (right - left + 1) - maxCount;

            // If replacements exceed k, shrink window
            while (replace > k) {
                freq[s.charAt(left) - 'A']--;
                left++;

                // Recalculate replacement count
                replace = (right - left + 1) - maxCount;
            }

            // Update maximum length
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );

            // Move right
            right++;
        }

        return maxLength;
    }
}  

      
