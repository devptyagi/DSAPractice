static void setZeroes(int[][] a) {
    boolean isCol = false;
    for(int i=0;i<a.length;i++) {
        if(a[i][0] == 0) isCol = true;
        for(int j=1;j<a[0].length;j++) {
            if(a[i][j] == 0) {
                a[i][0] = 0;
                a[0][j] = 0;
            }
        }
    }
    for(int i=1;i<a.length;i++) {
        for(int j=1;j<a[0].length;j++) {
            if(a[i][0] == 0 || a[0][j] == 0) {
                a[i][j] = 0;
            }
        }
    }
    if(a[0][0] == 0) {
        for(int j=0;j<a[0].length;j++) {
            a[0][j] = 0;
        }
    }
    if(isCol) {
        for(int i=0;i<a.length;i++) {
            a[i][0] = 0;
        }
    }
}
