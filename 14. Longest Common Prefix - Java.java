class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length -1, i = 0;
        String firstElement = strs[0], lastElement = strs[len];
        int lenOfFirst = firstElement.length(), lenOfLast = lastElement.length();
        while(i < lenOfFirst && i < lenOfLast){
            if(firstElement.charAt(i) == lastElement.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return firstElement.substring(0,i);
    }
        
}