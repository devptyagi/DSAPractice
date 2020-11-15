public static int evaluatePostFix(String exp){
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<exp.length();i++) {
        char c = exp.charAt(i);
        if(Character.isDigit(c)) {
            stack.push(c - '0');
        } else {
            int op1 = stack.pop();
            int op2 = stack.pop();
            int ans = 0;
            switch(c) {
                case '+': ans = op2 + op1; break;
                case '-': ans = op2 - op1; break;
                case '*': ans = op2 * op1; break;
                case '/': ans = op2 / op1; break;
            }
            stack.push(ans);
        }
    }
    return stack.pop();
}
