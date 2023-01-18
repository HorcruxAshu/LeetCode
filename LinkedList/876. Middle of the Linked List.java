class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//SC: O(1) TC: O(n) 
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}

