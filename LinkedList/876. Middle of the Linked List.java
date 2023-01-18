class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//SC: O(m + n) TC: O(n)
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        int size = 0;
        
        ListNode temporaryNode = head;
        while(temporaryNode != null){
            temporaryNode = temporaryNode.next;
            size++;
        }
        if(size % 2 != 0){
            ListNode dummy = head;
            int middleElement = size /2 + 1;
            int tempSize = 1;
            while(tempSize < middleElement){
                dummy = dummy.next;
                tempSize++;
            }
            return dummy;
        }else{
            ListNode dummy = head;
            int middleElement = size /2 + 1;
            int tempSize = 1;
            while(tempSize < middleElement){
                dummy = dummy.next;
                tempSize++;
            }
            return dummy;
        }
    }
}

