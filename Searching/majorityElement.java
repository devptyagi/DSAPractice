/*

Given an array A of N elements. 
Find the majority element in the array. 
A majority element in an array A of size N is an element that appears more than N/2 times in the array.

*/


static int majorityElement(int a[], int size) {
    int majIndex = 0, count = 1;
    for(int i=1;i<size;i++) {
        if(a[i] == a[majIndex]) {
            count++;
        }
        else {
            count--;
        }
        if(count == 0) {
            majIndex = i;
            count = 1;
        }
    }
    count = 0;
    for(int i=0;i<size;i++) {
        if(a[i] == a[majIndex]) count++;
    }
    if(count > size / 2) return a[majIndex];
    else return -1;
}
