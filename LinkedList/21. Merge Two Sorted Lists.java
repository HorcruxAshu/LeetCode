class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//In place merge

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while(list1 != null && list2 != null){
            ListNode tempNode = null;
            while(list1 != null && list1.val <= list2.val){
                tempNode = list1;
                list1 = list1.next;
            }
            tempNode.next = list2;
            ListNode swapNode = list1;
            list1 = list2;
            list2 = swapNode;
        }
        return res;
    }
}