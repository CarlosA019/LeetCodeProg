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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //variables just to keep track of the head and tail of the list
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        // loop until both lists are empty and no carry is left
        while (l1 != null || l2 != null || carry != 0) {
            int l1num = 0;
            if (l1 != null) {
                l1num = l1.val;//making sure it isnt null
            }

            int l2num = 0;
            if (l2 != null) {
                l2num = l2.val;
            }

            int sum = l1num + l2num + carry; 
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);

            // if its the first node, set head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode; // attach new node
                tail = tail.next;    // move tail forward
            }

            // move to the next nodes in the input lists
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head;
    }
}
