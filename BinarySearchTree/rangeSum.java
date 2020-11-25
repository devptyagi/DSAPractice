int ans;

public int rangeSumBST(Node root, int low, int high) {
    ans = 0;
    dfs(root, low, high);
    return ans;
}

void dfs(Node root, int l, int r) {
    if(root == null) return;
    if(root.data >= l && root.data <= r) ans += root.data;
    if(root.data > l) dfs(root.left, l, r);
    if(root.data < r) dfs(root.right, l, r);
}
