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
            int l1num;
            if (l1 != null) {
                l1num = l1.val;
            } else {
                l1num = 0;
            }

            int l2num;
            if (l2 != null) {
                l2num = l2.val;
            } else {
                l2num = 0;
            }

            int sum = l1num + l2num + carry; //getting the sum of that one digit
            carry = sum / 10;              // carry for the next step
            ListNode newNode = new ListNode(sum % 10); // digit for this step

            // if this is the first node, set head and tail
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

