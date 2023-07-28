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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode curr = head;

        while(curr.next!=null){
            if(curr.val!=curr.next.val){
                curr = curr.next;
            }else{
                curr.next = curr.next.next;
            }
        }

        // ListNode curr = head;
        // ListNode temp = head.next;
        // while(curr.next!=null){
        //     if(curr.val == temp.val){
        //         curr.next = temp.next;
        //     }else{
        //         curr = temp; 
        //     }
        //     temp = temp.next;
        // }
        return head;
    }
}
