class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int prevIndex = stk.pop();
                ans[prevIndex] = i - prevIndex;
                //ans[prevIndex] = currentIndex - prevIndex;
            }
            stk.push(i);
        }
        return ans;
    }
}