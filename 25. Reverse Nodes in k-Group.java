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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k==1) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode beforeS = dummy;
        ListNode e = head;

        int i=0;

        while(e!=null){
            i++;
            if(i%k==0){
                //reverse
                ListNode s = beforeS.next;
                ListNode temp = e.next;
                reverse(s, e);
                beforeS.next = e;
                s.next = temp;
                beforeS = s;
                e = temp;
            }else{
                e = e.next;
            }
        }
        return dummy.next;
        /*
Time  Complexity: O(N)
Space Complexity: O(1)
*/





        // ListNode s = head, e = head;
        
        // int inc = k-1;
        // while(inc!=0){
        //     e = e.next;
        //     if(e==null) return head;
        //     inc--;
        // }
        // ListNode nextHead = reverseKGroup(e.next, k);
        // reverse(s, e);
        // s.next = nextHead;

        // return e;   
        /*
Time  Complexity: O(N)
Space Complexity: O(N / K) { Recursive Stack Space }
*/

    }
    void reverse(ListNode s, ListNode e){
        ListNode prev = null;
        ListNode curr = s;
        ListNode next = s.next;
        while(prev != e){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null) next = next.next;
        }
    }
}
