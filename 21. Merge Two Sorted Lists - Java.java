/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode one, ListNode two) {
        if(one != null && two != null){
            if(one.val < two.val){
                one.next = mergeTwoLists(one.next, two);
                return one;
            } else {
                two.next = mergeTwoLists(one, two.next);
                return two;
            }
        }
        if(one == null){
            return two;
        }
        return one;
    }
}