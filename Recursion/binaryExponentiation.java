static int RecursivePower(int n,int p) {
    if (p == 0)return 1;
    int res = RecursivePower(n, p / 2);
    if (p % 2 != 0) return res * res * n;
    else return res * res;
}
