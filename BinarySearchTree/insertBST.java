Node insert(Node root, int key) {
    Node newNode = new Node(key);
    if(root == null) {
        root = newNode;
        return root;
    }
    if(key == root.data) return root;
    else if(key > root.data) root.right = insert(root.right, key);
    else root.left = insert(root.left, key);
    return root;
}
