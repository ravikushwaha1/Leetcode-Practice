class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int current = nums[0];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            current = Math.max(current, nums[i]);
            arr[i] = gcd(nums[i], current);
        }
        Arrays.sort(arr);

        long ans = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            ans += gcd(arr[i], arr[j]);
            i++;
            j--;

        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}