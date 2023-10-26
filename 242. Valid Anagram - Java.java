class Solution {
    // s = garden and t = danger will be true
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
           return false;
       }
        int[] count = new int[26]; // for counting all 26 letters
        
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        for(char c : t.toCharArray()){
            count[c-'a']--;
        }
        // Check if the count array is all zeros
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}