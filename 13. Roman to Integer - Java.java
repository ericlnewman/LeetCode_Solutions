class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(){{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        // declare variables to hold current value, previous number
        char[] array = s.toCharArray();
        int answer = 0, prev = 0, len = s.length()-1;
        // iterate over the string in reverse
        for(int i = len; i >= 0; i--){
            int number = map.get(s.charAt(i));
            if(number >= prev){
                answer -= number;
            } else {
                answer+=number;
            }
             prev = number;
        }
   
        return Math.abs(answer);
}
}