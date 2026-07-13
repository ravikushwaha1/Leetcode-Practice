class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // Only one element left
            if (st == end) {
                return nums[st];
            }

            // Handle first element
            if (mid == 0) {
                if (nums[0] != nums[1])
                    return nums[0];
                else
                    st = mid + 1;
                continue;
            }

            // Handle last element
            if (mid == nums.length - 1) {
                if (nums[mid] != nums[mid - 1])
                    return nums[mid];
                else
                    end = mid - 1;
                continue;
            }

            // Found the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Check index parity
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    st = mid + 2;
                } else {
                    end = mid - 2;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}