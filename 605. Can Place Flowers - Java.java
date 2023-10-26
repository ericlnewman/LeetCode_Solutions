class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        int len = flowerbed.length-1;
        for(int i = 0; i <= len; i++){
            if(flowerbed[i] ==0 &&
              (i == 0 || flowerbed[i - 1] ==0) &&
              (i == len || flowerbed[i+1] == 0)){
                n--;
               if(n == 0) return true;
               flowerbed[i] = 1;
            }
        }
        return false;
    }
}