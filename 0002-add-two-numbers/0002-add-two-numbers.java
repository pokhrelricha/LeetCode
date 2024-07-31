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
          ListNode dummyHead = new ListNode(0); // Dummy head node to simplify code
        ListNode current = dummyHead; // Pointer to build the result list
        int carry = 0; // Carry for digit addition
        
        // Traverse both lists
        while (l1 != null || l2 != null) {
            int l1Value = (l1 != null) ? l1.val : 0;
            int l2Value = (l2 != null) ? l2.val : 0;
            int sum = carry + l1Value + l2Value;
            
            carry = sum / 10; // Update carry
            current.next = new ListNode(sum % 10); // Create new node with the digit
            current = current.next; // Move to the next node
            
            if (l1 != null) l1 = l1.next; // Move to the next node in l1
            if (l2 != null) l2 = l2.next; // Move to the next node in l2
        }
        
        // Check for remaining carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next; // Return the head of the resultant list
    }
}