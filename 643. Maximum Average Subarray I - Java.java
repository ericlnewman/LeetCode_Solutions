class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE, d =0, sum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            sum+=nums[i];
            if(i>=k-1){
                d=sum/k;
                max = Math.max(max,d);
                sum-=nums[i-(k-1)];
            }
        }
        return max;
    }
    
}