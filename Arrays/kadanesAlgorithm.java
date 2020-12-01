static int maxSubArray(int[] nums) {
    int max = nums[0], curr = 0;
    for(int i : nums) {
        if(curr < 0) curr = 0;
        curr += i;
        max = Math.max(curr, max);
    }
    return max;
}
