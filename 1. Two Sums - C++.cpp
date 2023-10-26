class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
           map<int, int> indexMap;
        for (int i = 0; i < nums.size(); i++) {
            int difference = target - nums[i];          
            if (indexMap.find(difference) != indexMap.end()) {
                return vector<int>{indexMap[difference], i};
            }
            indexMap[nums[i]] = i;
        }
        return vector<int>{};
    }
};