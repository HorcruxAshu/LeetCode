class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        ListNode tempA = headA;
        ListNode tempB = headB;
        ListNode runA = headA;
        ListNode runB = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(tempA != null || tempB != null){
            if(tempA != null){tempA = tempA.next; sizeA++;}
            if(tempB != null) {tempB = tempB.next;sizeB++;}
            
        }
        if(sizeA > sizeB){
            int diff = sizeA - sizeB;
            while(diff-->0){
                runA = runA.next;
            }
        }else if(sizeA < sizeB){
            int diff = sizeB - sizeA;
            while(diff-->0){
                runB = runB.next;
            }
        }
        while(runA != null || runB != null){
            if(runA == runB && runA.val != 0){
                return runA;
            } 
            runA = runA.next;
            runB = runB.next;
        }
        
        // System.out.println(sizeA + " " + sizeB+ " " + runA.val + " " + runB.val);
        return null;
    }
}