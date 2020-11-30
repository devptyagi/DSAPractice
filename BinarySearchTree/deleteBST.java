public static Node deleteNode(Node root, int x) {
  if(root == null) return null;
  if(root.data < x) {
      root.right = deleteNode(root.right, x);
  } else if(root.data > x) {
      root.left = deleteNode(root.left, x);
  } else {
      if(root.left == null) return root.right;
      else if(root.right == null) return root.right;
      else {
          Node succ = getSuccessor(root);
          root.data = succ.data;
          root.right = deleteNode(root.right, succ.data);
      }
  }
  return root;
}

static Node getSuccessor(Node root) {
    Node curr = root.right;
    while(curr != null && curr.left != null) {
        curr = curr.left;
    }
    return curr;
}
