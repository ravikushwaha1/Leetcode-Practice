class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
            
        }
        Set<Integer> ravi = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            ravi.add(nums[i]);
        }
        List<Integer> li = new ArrayList<>();
        for(int i = min;i <= max;i++){
            if(!ravi.contains(i)){
                li.add(i);
            }
        }
        return li;

    }
}