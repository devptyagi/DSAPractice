static void preorder(Node root) {
    if(root == null) return;
    preorder(root.left);
    System.out.println(root.data);
    preorder(root.right);
}
