class Solution {
    public boolean isValid(String s) {
        // create a stack to add elements to be added and compared at each character
        Stack<Character> stack = new Stack<>();
        // iterate over the string for each character
        for(char c : s.toCharArray()){
            // if the char is an opening bracket, add it to the stack
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else {
                // if the array is empty, return false
            if(stack.isEmpty()){
                return false;
            }
            // create a variable to pop the char off the stack
            char p = stack.pop();
            // compare the current char to the popped off stack, if these are not correct order, return false, otherwise return true
            if(c == ']' && p != '[' || c == '}' && p != '{' || c == ')' && p != '('){
                return false;
            }
          }
        }
        return stack.isEmpty();
    }
}