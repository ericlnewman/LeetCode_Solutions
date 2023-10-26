class Solution {
    public int mySqrt(int x) {
         if(x <= 1){
            return x;
        }
        int beg = 0, end = x, ans = 0;
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            if(x/mid == mid){
                return mid;
            }
            if(x/mid < mid){
                end = mid - 1;
            } else {
                beg = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}