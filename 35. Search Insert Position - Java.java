class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        while(count < nums.length){
            if(nums[count] >= target){
                return count;
            }
            count++;
        }
        return count++;
    }
}