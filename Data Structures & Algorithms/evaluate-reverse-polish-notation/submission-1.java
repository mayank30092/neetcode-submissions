class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int a = s.pop();
                int b = s.pop();

                if (token.equals("+")) s.push(b + a);
                else if (token.equals("-")) s.push(b - a);
                else if (token.equals("*")) s.push(b * a);
                else s.push(b / a);

            } else s.push(Integer.parseInt(token));
        }
        return s.pop();
    }
}