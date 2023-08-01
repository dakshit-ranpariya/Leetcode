class BrowserHistory {

    class Node{
        Node next, prev;
        String url;

        Node(String url){
            next = null;
            prev = null;
            this.url = url;
        }
    
    }

    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev != null && steps-- > 0){
            curr = curr.prev;
        }

        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps-- > 0){
            curr = curr.next;
        }

        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
