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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode prev = slow;
        ListNode next;
        prev.next = null;


        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = head;
        while(prev!=null){
            if(prev.val != temp.val){
                return false;
            }
                temp = temp.next;
                prev = prev.next;
            
        }
        return true;



        // BRUTE FORCE


        // Stack<Integer> stack = new Stack<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     stack.push(temp.val);
        //     temp = temp.next;
        // }
        // ListNode i = head;
        // while(!stack.isEmpty() && i!=null){
        //     if(stack.peek() == i.val){
        //         stack.pop();
        //         i = i.next;
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
    }
}
