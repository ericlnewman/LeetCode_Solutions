class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // first I need to iterate over the ransom note
        for(int i = 0; i < ransomNote.length(); i++){
            // while iterating over the ransom note
            // determine the current character, c
            char c = ransomNote.charAt(i);
            // then using the Java string method indexOf (which loops over an array), assign it to a varaible called matchIndex
            int matchIndex = magazine.indexOf(c);
            // and returns -1 if the character does not match the input character
            // if indexOf return -1
                // return false
            if(matchIndex == -1){
                return false;
            }
            // then assign magazine the substring of the initial value to the matchIndex
            magazine = magazine.substring(0, matchIndex) + magazine.substring(matchIndex+1);

        }
        // if it has been able to not be false after this, return true;
        return true;
    }
}