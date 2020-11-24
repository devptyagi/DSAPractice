boolean search(Node root, int x) {
    if(root == null) return false;
    if(root.data == x) return true;
    if(x > root.data) return search(root.right, x);
    else return search(root.left, x);
}
