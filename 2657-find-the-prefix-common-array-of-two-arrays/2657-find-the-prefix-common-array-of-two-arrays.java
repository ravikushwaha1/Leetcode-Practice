class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];
         
        int count = 0;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
          

            seenA[A[i]] = true;

            if (seenB[A[i]]) {
                count++;
            }

            seenB[B[i]] = true;

            if (seenA[B[i]]) {
                count++;
            }

            ans[i] = count;

        }
        return ans;

    }
}