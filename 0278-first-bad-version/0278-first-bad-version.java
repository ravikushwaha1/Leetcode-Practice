/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low < high){
        int mid = low + (high - low) / 2;
         if (isBadVersion(mid)) {
                // mid is bad, so the first bad version
                // could be mid itself or before mid
                high = mid;
            } else {
                // mid is good, so the first bad version
                // must be after mid
                low = mid + 1;
            }
        }

        return low;
    }
}