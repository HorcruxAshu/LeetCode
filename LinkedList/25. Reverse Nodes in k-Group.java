class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        
        //Calculating size and groups to be reversed.
        int size = 0;
        ListNode  sizeNode = head;
        while(sizeNode != null){
            sizeNode = sizeNode.next;
            size++;
        }
        
        
        //Assigning dummyNode, and keeping a track of current, previous and nextNode.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previousNode = dummy;
        ListNode currentNode = dummy;
        ListNode nextNode = dummy;
        while(size >= k){
            currentNode = previousNode.next;
            nextNode = currentNode.next;
            //Between K nodes there will k - 1 links to be reversed.
            for(int i = 1; i < k; i++){
                currentNode.next = currentNode.next.next;
                nextNode.next = previousNode.next;
                previousNode.next = nextNode;
                nextNode = currentNode.next;    
            }
            previousNode = currentNode;
            size -=k;
        }
        return dummy.next;
    }
}
