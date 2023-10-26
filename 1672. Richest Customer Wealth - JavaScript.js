/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let newArr = [];
    for(let arr of accounts){
        let sum = 0;
        for(let i of arr){
            sum+=i;
        }
        newArr.push(sum);
    }
    let max = 0;
    for(let i of newArr){
       if(max < i){
           max = i;
       }
    }
    return max;
};