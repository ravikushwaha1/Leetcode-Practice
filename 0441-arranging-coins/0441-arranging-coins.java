class Solution {
    public int arrangeCoins(int n) {
        int st = 0;
        int ed = n;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            long k = (long) mid * (mid + 1) / 2;
            if (k == n) {
                return mid;
            } else if (k < n) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
        }
        return ed;
    }
}