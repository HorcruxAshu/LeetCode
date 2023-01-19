class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//Copy the next node value to the current node value and point current node to next next of the next node

class Solution {
    public void deleteNode(ListNode node) {
          node.val = node.next.val;
          node.next = node.next.next;
    }
}
