static boolean isPalin(int n) {
    int res = rev(n, 0);
    if(res == n) return true;
    else return false;
}

static int rev(int n, int temp) { 
    if (n == 0) return temp; 
    temp = (temp * 10) + (n % 10); 
    return rev(n / 10, temp); 
}
