/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
    let curr=head ;
    let count=0; //counter
    while(curr){
        count++ ;
        curr = curr.next ;
    }
    let mid = Math.floor(count/2); 
    curr = head ;
    for(let i=0;i<mid;i++){
        curr = curr.next;
    }
    return curr;   
};