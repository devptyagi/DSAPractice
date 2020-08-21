// arr[]: input array
// n: size of inout array
public static void printArrayRecursively(int arr[], int n) {
    if(n == 0) return;
    printArrayRecursively(arr, n - 1);
    System.out.print(arr[n - 1] + " ");
}
