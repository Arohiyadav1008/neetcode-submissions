class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            String current = s.substring(left, right);

            if (current.indexOf(s.charAt(right)) != -1) {
                left = left + current.indexOf(s.charAt(right)) + 1;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}