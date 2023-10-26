/**
 * @param {number} num
 * @return {number}
 */
const checkIfEven = function(n){
    if(n % 2 === 0){
        return true;
    }
    return false;
};
var numberOfSteps = function(num) {
    let counter = 0;
    while(num != 0){
        if(checkIfEven(num)){
            num/=2;
            counter++;
        } else {
            num-=1;
            counter++;
        }
    }
    return counter;
};