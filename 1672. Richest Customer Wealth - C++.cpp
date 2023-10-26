class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        vector<int> newVector;
        for(vector<int> arr : accounts){
            int sum = 0;
            for(int i : arr){
                sum += i;
            }
            newVector.push_back(sum);
        }
        int max = 0;
        for(int i : newVector){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
};