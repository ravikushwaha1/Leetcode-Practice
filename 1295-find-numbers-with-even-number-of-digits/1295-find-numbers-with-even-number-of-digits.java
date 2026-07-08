class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int ravi = nums[i];
            int digitCount = 0;

           while (ravi > 0) {
               digitCount = digitCount + 1;
               ravi = ravi / 10;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}