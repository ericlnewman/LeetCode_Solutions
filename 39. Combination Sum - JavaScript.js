/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    const results = [];
    function backtrack(index, sum, array){
        if(sum === target){
            results.push([...array]);
            return;
        }
        if(sum > target || index === candidates.length){
            return;
        }
        // iterate over the array starting at the index
        for(let i = index; i < candidates.length; i++){
            const current = candidates[i];
            array.push(current);
            backtrack(i, sum+current, array);
            array.pop();
        }
    }
    backtrack(0,0,[]);
    return results;
};