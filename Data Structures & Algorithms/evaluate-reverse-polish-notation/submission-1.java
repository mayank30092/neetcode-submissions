class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 

        for(String ch: tokens){
            if(ch.equals("+") || ch.equals("-") ||
   ch.equals("*") || ch.equals("/")){
                int nOne = stack.pop();
                int nTwo = stack.pop();
                if(ch.equals("+")){
                    int sum = nOne + nTwo;
                    stack.push(sum);
                }else if (ch.equals("-")){
                    int diff = nTwo-nOne;
                    stack.push(diff);
                }else if (ch.equals("*")){
                    int mul = nOne*nTwo;
                    stack.push(mul);
                }else{
                    int div = nTwo/nOne;
                    stack.push(div);
                }
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
