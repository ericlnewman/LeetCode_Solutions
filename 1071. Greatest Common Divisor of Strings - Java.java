class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int first = str1.length();
        int second = str2.length();
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        while(second > 0){
            int temp = second;
            second =  first % second;
            first = temp;
        }
        return str1.substring(0, first);
    }
}