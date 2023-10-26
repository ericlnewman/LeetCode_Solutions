class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j : accounts[i]){  
             sum+=j;
            }
            list.add(sum);
        }
        int max = 0;
        for(int i : list){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}