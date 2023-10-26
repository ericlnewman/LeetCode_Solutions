import java.util.Stack;
class Solution {
    public void moveZeroes(int[] nums) {
        
      Stack<Integer> stack = new Stack<>();

        // Push non-zero elements into the stack
        for (int i = nums.length-1; i >= 0; i-- ) {
            if (nums[i] != 0) {
                stack.push(nums[i]);
            }
        }

        // Pop elements from the stack and put them at the end of nums array
        int index = 0;
        while (!stack.isEmpty()) {
            nums[index++] = stack.pop();
        }

        // Fill the remaining positions with zeroes
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    
}