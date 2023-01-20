import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode detectCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode startingNode = head;
        
        while(fastPointer != null && fastPointer.next != null ){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) break;
        }
        while(startingNode != null && slowPointer != null){
            if(startingNode == slowPointer && fastPointer.next != null){
                return startingNode;
            }
            startingNode = startingNode.next;
            slowPointer = slowPointer.next;
        }  
        return null;      
    }
}