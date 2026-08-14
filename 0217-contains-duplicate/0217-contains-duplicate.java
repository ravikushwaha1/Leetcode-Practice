class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> ravi = new HashSet<>();
       for(int i = 0; i < nums.length;i++){
        if(ravi.contains(nums[i])){
            return true;
        }else{
            ravi.add(nums[i]);
        }
       }
       return false;
    }
}