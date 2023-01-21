class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null) return head;
        ListNode tempNode = head; 
        int size =  1;
        while(tempNode.next != null){
            tempNode = tempNode.next;
            size++;
        }
        tempNode.next = head;
        k = size - k % size;
        
        while(k -- > 0){
            tempNode = tempNode.next;
        }
        
        //super important step is to assign the next of size - kth node as a head and the cut the link;
        head = tempNode.next;
        tempNode.next = null;
        
        return head;
    }
}