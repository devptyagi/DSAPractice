static void levelOrder(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()) {
        Node curr = q.poll();
        System.out.print(curr.data + " ");
        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);
    }
}
