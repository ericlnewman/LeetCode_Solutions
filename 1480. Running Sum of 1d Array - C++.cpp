class Solution {

public:

    vector<int> runningSum(vector<int>& nums) {

        vector<int> newVector;

        int n = 0;

        for(int i : nums){

            n+=i;

            newVector.push_back(n);

        }

        return newVector;

    }

};