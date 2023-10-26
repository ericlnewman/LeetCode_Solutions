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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        ArrayList<ListNode> array = new ArrayList<>();
        while(temp != null){
            array.add(temp);
            temp = temp.next;
            length++;
        }
        return array.get(length/2);
    }
}