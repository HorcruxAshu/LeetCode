import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {

    // T.C = O(n)
    //S.C = O(n)
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode tempNode = head;
        Set<ListNode> set = new HashSet<>();
        while(tempNode != null){
            if(set.contains(tempNode)) return true;
            set.add(tempNode);
            tempNode = tempNode.next;
        }
        return false;        
    }
}
