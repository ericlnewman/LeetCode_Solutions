class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x), r = "";
        int len = s.length() -1;
        for(int i = len; i >= 0; i--){
            r+=s.charAt(i);
        }
        if(s.equals(r)){
            return true;
        }
        return false;
    }
}