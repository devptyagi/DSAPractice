static boolean isBalanced(String s) {
  ArrayDeque<Character> stack = new ArrayDeque<>();
  for(int i=0;i<s.length();i++) {
    char c = s.charAt(i);
    if(c == ']') {
      if(stack.isEmpty()) return false;
      if(stack.peek() != '[') return false;
      stack.pop();
    } else if(c == '}') {
      if(stack.isEmpty()) return false;
      if(stack.peek() != '{') return false;
      stack.pop();
    } else if(c == ')') {
      if(stack.isEmpty()) return false;
      if(stack.peek() != '(') return false;
      stack.pop();
    } else {
      stack.push(c);
    }
  }
  return stack.isEmpty();
}
