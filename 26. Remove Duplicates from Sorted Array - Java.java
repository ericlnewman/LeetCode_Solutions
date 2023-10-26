class Solution {
    public int removeDuplicates(int[] nums) {
        // need to store the numbers in a second data type (likely or array)
        // then compare the current index to the stored values, if these are the same
        // remove it... or add it to the second array
        int len = nums.length;
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1; // At least one unique element (the first one).
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}