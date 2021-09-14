public class Solution {
  
    public String solve(int A) {
        int[] res = new int[500];
        int resSize = 1;
        res[0] = 1;
        for(int i = 2; i <= A; i++) {
            resSize = multiply(i, res, resSize);
        }
        StringBuilder factorial = new StringBuilder();
        for(int i = resSize - 1; i >= 0; i--) {
            factorial.append(res[i]);
        }
        return factorial.toString();
    }

    int multiply(int x, int[] res, int resSize) {
        int carry = 0;
        for(int i = 0; i < resSize; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        while(carry != 0) {
            res[resSize] = carry % 10;
            carry /= 10;
            resSize++;
        }
        return resSize;
    }
}
