/**
 * @param {string} s
 * @return {boolean}
 */
// create a class Stack to preform stack operations on an array data structure
class Stack{
    constructor(){
        this.items = [];
    }
    // push
    push(item){
        this.items.push(item);
    }
    // pop
    pop(){
        if(this.items.length == 0) return "length is 0";
        return this.items.pop();
    }
    // isEmpty
    isEmpty(){
        return this.items.length === 0;
    }
}
var isValid = function(s) {
    // create a stack from stack class
    const stack = new Stack();
    // create a length variable for s
    const len = s.length;
    // iterate over the s string
    for(let i = 0; i < len; i++){
        // create a variable for the current element
        const c = s[i];
        // if the current element is open brackets add to the stack
        if(c === '[' || c === '{' || c === '('){
            stack.push(c);
        } else {
            // if the stack is empty, return false
            if(stack.isEmpty()){
                return false;
            }
            // otherwise, create a variable that holds the popped out element
            const p = stack.pop();
            // if the popped out element and the current element is not the correct bracket, return false
            if(c === ']' && p != '[' || c === '}' && p !='{' || c === ')' && p!= '('){
                return false;
            }
        }
    }
    // return an empty stack if nothing passes
    return stack.isEmpty();
};