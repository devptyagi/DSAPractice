static void spirallyTraverse(int a[][], int r, int c) {
    int top = 0;
    int down = r - 1;
    int left = 0;
    int right = c - 1;
    while(left <= right && top <= down) {
        for(int i=left;i<=right;i++) {
            System.out.print(a[top][i] + " ");
        }
        top++;
        for(int i=top;i<=down;i++) {
            System.out.print(a[i][right] + " ");
        }
        right--;
        if(top > down) break;
        for(int i=right;i>=left;i--) {
            System.out.print(a[down][i] + " ");
        }
        down--;
        if(right < left) break;
        for(int i=down;i>=top;i--) {
            System.out.print(a[i][left] + " ");
        }
        left++;
    }
    return res;
}
