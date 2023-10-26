class Solution {
    public int[] runningSum(int[] nums) {
        int n = 0;
        int len = nums.length;
        int[] newArray = new int[len];
        for(int i = 0; i < len; i++){
            n+=nums[i];
            newArray[i] = n;
        }
        return newArray;
    }
}