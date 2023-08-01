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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        ListNode l1 = reverse(list1);
        ListNode l2 = reverse(list2);

        int carry = 0;

        while(l1!=null && l2!=null){
            int value = l1.val + l2.val + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;
        }
        while(l1!=null){
            int value = l1.val + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int value = l2.val + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
        }

        if(carry>0){
            l3.next = new ListNode(carry);
        }
        // ListNode ans = reverse(head.next);
        return reverse(head.next);
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
