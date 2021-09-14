/*

Problem Description

Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.

The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array.

Find and return the required subarray.


*/

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
      
        long sum = 0;
        long maxSum = 0;
        int left = 0, right = 0, savedLeft = -1, savedRight = -1;
      
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) >= 0) {
                sum += A.get(i);
                if(sum > maxSum || (sum == maxSum && savedRight - savedLeft < right - left)) {
                    maxSum = sum;
                    savedLeft = left;
                    savedRight = right;
                }
            } else {
                left = i + 1;
                sum = 0;
            }
            right++;
        }
        if(savedLeft == -1) return res;
        for(int i = savedLeft; i <= savedRight; i++) {
            res.add(A.get(i));
        }
        return res;
    }
}
