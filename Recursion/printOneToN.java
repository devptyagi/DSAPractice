public static void printOneToN(int n) {
    if(n == 0) return;
    printOneToN(n - 1);
    System.out.print(n + " ");
}
