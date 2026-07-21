class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] sum = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = nums[i] * nums[i];
            sum[i] = ans;

        }
        Arrays.sort(sum);
        return sum;
    }
}