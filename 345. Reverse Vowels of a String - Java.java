import java.util.Stack;
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
              c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                stack.push(c);
            }
        }
        
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
              c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                ans+=stack.pop();
            } else {
                ans+=c;
            }
        }
        return ans;
    }
}