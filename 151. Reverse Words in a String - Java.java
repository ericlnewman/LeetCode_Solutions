class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        int len = a.length;
        String ans = "";
        for(int i = len -1; i >= 0; i--){
            ans+=a[i]+ " ";
        }
        return ans.trim();
    }
}