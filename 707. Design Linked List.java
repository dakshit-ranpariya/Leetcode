//Singly ====================>>>>>>>>>>>>>>

class Node{
        int data;
        Node next; 


        public Node(int data){
            this.data = data;
            this.next = null;
        }
}
class MyLinkedList {
    Node head;
        Node tail;
        int size =0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        size++;

    }
    
    public void addAtTail(int val) {
        Node nn = new Node(val);
        if(tail == null){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index == 0){
            addAtHead(val);
        }else if(index == size){
            addAtTail(val);
        }else{
            Node nn = new Node(val);
            Node prev = null;
            Node curr = head;

            for(int i=0; i<index; i++){
                prev = curr;
                curr = curr.next;
            }

            nn.next = curr;
            prev.next = nn;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >=size){
            return;
        }
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else{
            Node prev = null;
            Node curr = head;
            for(int i=0; i<index; i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            if(curr==tail){
                tail=prev;
            }
        }
        size--;
    }
}


//  Doubly =========================>>>>>>>>>>>>>>>>


// class ListNode {
//     int val;
//     ListNode prev;
//     ListNode next;
//     public ListNode(int val) {
//         this.val = val;
//         this.prev = null;
//         this.next = null;
//     }
// }

// class MyLinkedList {

//     ListNode left;
//     ListNode right;

//     public MyLinkedList() {
//         left = new ListNode(0);
//         right = new ListNode(0);
//         left.next = right;
//         right.prev = left;
//     }
    
//     public int get(int index) {
//         ListNode cur = left.next;
//         while(cur != null && index > 0) {
//             cur = cur.next;
//             index -= 1;
//         }
//         if(cur != null && cur != right && index == 0) {
//             return cur.val;
//         }
//         return -1;
//     }
    
//     public void addAtHead(int val) {
//         ListNode node = new ListNode(val);
//         ListNode next = left.next;
//         ListNode prev = left;
//         prev.next = node;
//         next.prev = node;
//         node.next = next;
//         node.prev = prev;
//     }
    
//     public void addAtTail(int val) {
//         ListNode node = new ListNode(val);
//         ListNode next = right;
//         ListNode prev = right.prev;
//         prev.next = node;
//         next.prev = node;
//         node.next = next;
//         node.prev = prev;
//     }
    
//     public void addAtIndex(int index, int val) {
//         ListNode cur = left.next;
//         while(cur != null && index > 0) {
//             cur = cur.next;
//             index -= 1;
//         }
//         if(cur != null && index == 0) {
//             ListNode node = new ListNode(val);
//             ListNode next = cur;
//             ListNode prev = cur.prev;
//             prev.next = node;
//             next.prev = node;
//             node.next = next;
//             node.prev = prev;
//         }
//     }
    
//     public void deleteAtIndex(int index) {
//         ListNode cur = left.next;
//         while(cur != null && index > 0) {
//             cur = cur.next;
//             index -= 1;
//         }
//         if(cur != null && cur != right && index == 0) {
//             ListNode next = cur.next;
//             ListNode prev = cur.prev;
//             next.prev = prev;
//             prev.next = next;
//         }
//     }
// }
