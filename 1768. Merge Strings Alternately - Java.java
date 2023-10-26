class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        int lenOfBoth = word1.length() + word2.length(), lenOfOne = word1.length(), lenOfTwo = word2.length();
        for(int i = 0; i < lenOfBoth; i++){
            if(i<lenOfOne){
                sb.append(word1.charAt(i));
            }
            if(i<lenOfTwo){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}