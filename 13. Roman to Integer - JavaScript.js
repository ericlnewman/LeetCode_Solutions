/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    // declare map place holder to store keys to values
    let romanMap = {
        'M': 1000,
        'D': 500,
        'C': 100,
        'L': 50,
        'X': 10,
        'V': 5,
        'I': 1

    };
    let answer = 0;
    let prev = 0;
   // console.log("string is " + s);
   for(let i = s.length-1; i >=0; i--){
    let number = romanMap[s[i]];
   // console.log("number is " + number);
    if(prev > number){
        answer -= number;
    //    console.log("answer is " + answer);
    } else {
        answer += number;
     //   console.log("or else answer is " + answer);
    }
    prev = number;
   }
   return answer;
};
//console.log(romanToInt("III"));
// console.log("");
// console.log(romanToInt("LVIII"));
// console.log("");
// console.log(romanToInt("MCMXCIV"));