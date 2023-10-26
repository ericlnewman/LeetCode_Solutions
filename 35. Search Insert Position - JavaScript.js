/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target, i = 0) {
    if(nums[i] === undefined) return i;
    if(nums[i] >= target) return i;
    return searchInsert(nums, target, i+=1);
};