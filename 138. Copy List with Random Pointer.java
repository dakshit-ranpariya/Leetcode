/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public void copyList(Node head){
        Node temp = head;
        Node n = head.next;
        while(temp!=null){
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = n;
            temp = n;
            if(n!=null) n = n.next;
        }
    }
    public void handelRandom(Node head){
        Node temp = head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
    }
    public Node detach(Node head){
        Node dummy = new Node(-1);
        Node temp = head;
        Node tail = dummy;
        while(temp!=null){
            tail.next = temp.next;
            tail = tail.next;
            temp.next = tail.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        copyList(head);
        handelRandom(head);

        return detach(head);
    }
}
