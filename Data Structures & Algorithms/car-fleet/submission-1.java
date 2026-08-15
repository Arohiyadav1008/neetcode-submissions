class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        int[][] cars = new int[n][2];

        // Store position and speed
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort by position in descending order
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            double time = (double) (target - cars[i][0]) / cars[i][1];

            // If current car takes longer,
            // it cannot catch the fleet ahead
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // Otherwise, it catches the fleet ahead,
            // so don't push it.
        }

        return stack.size();
    }
}