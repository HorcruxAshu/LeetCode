class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        //Most Optimal Approach

        //T.C = O(2m)
        //S.C = O(1)

        if(headA == null || headB == null) return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
      
        while(tempA != tempB){
            tempA = tempA == null ? headB: tempA.next;
            tempB = tempB == null ? headA: tempB.next;
        }
        
        return tempA;
    }
}