class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int right = 0; right < n; right++) {

            // 1. Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= right - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements from the back
            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(right);

            // 4. Window is ready
            if (right >= k - 1) {
                result[right - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}