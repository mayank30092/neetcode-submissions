class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(String c: tokens){
           if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int a = s.pop();
                int b = s.pop();
                switch(c){
                    case "+":
                        s.push(b + a);
                        break;
                    case "-":
                        s.push(b - a);
                        break;
                    case "*":
                        s.push(b * a);
                        break;
                    case "/":
                        s.push(b / a);
                        break;
                }
            }else{
                int num = Integer.valueOf(c);
                s.push(num);
            }
        }
        return s.peek();
    }
}
