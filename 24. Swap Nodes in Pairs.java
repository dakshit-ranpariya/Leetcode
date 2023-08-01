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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;
            slow = slow.next.next;
            fast = fast.next.next;
        }
        if(slow!=null && slow.next!=null){
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;
        }
        return head;
    }
}
