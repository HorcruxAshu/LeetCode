import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> map = new HashSet<>();
        ListNode temp = head;
        while(temp != null){
            if(map.contains(temp)){
                return temp;
            }else{
                map.add(temp);
                temp = temp.next;
            }
        }
        return null;
    }
}