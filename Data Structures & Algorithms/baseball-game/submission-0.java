class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String op : operations) {

            if (op.equals("+")) {

                int a = stack.pop();
                int b = stack.peek();

                stack.push(a);

                int score = a + b;
                stack.push(score);
                sum += score;

            } else if (op.equals("D")) {

                int score = stack.peek() * 2;
                stack.push(score);
                sum += score;

            } else if (op.equals("C")) {

                sum -= stack.pop();

            } else {

                int score = Integer.parseInt(op);
                stack.push(score);
                sum += score;
            }
        }

        return sum;
    }
}