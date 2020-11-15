public static String infixToPostfix(String exp) {
  Stack<Character> st = new Stack<>();
  StringBuilder res = new StringBuilder();
  for(int i=0;i<exp.length();i++) {
      char c = exp.charAt(i);
      if(Character.isLetterOrDigit(c)) {
          res.append(c);
      } else if(c == '(') {
          st.push(c);
      } else if(c == ')') {
          while(!st.isEmpty() && st.peek() != '(') {
              res.append(st.pop());
          }
          st.pop();
      } else {
          while(!st.isEmpty() && (precedence(c) <= precedence(st.peek()))) {
              res.append(st.pop());
          }
          st.push(c);
      }
  }
  while(!st.isEmpty()) {
      res.append(st.pop());
  }
  return res.toString();
}

static int precedence(char c) {
    switch(c) {
        case '+':
          case '-': return 1;
          case '*':
          case '/': return 2;
          case '^': return 3;
    }
    return  -1;
}
