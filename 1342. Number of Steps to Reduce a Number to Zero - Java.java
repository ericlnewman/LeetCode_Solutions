class Solution {
    boolean checkIfEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public int numberOfSteps(int num) {
        int counter = 0;
        while(num != 0){
            if(checkIfEven(num)){
                num/=2;
                counter++;
            } else {
                num-=1;
                counter++;
            }
        }
        return counter;
    }
}