static class QueueObj{
    Node node;
    int hd;
    QueueObj(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

static void topView(Node root) {
    Queue<QueueObj> q = new LinkedList<>();
    Map<Integer, Node> map = new TreeMap<>();
    if (root == null) { 
        return; 
    } else { 
        q.add(new QueueObj(root, 0)); 
    } 
    while(!q.isEmpty()) {
        QueueObj temp = q.poll();
        if(!map.containsKey(temp.hd)) {
            map.put(temp.hd, temp.node);
        }
        if(temp.node.left != null) {
            q.add(new QueueObj(temp.node.left, temp.hd - 1));
        }
        if(temp.node.right != null) {
            q.add(new QueueObj(temp.node.right, temp.hd + 1));
        }
    }
    for(Map.Entry<Integer, Node> e : map.entrySet()) {
        System.out.print(e.getValue().data + " ");
    }
}
