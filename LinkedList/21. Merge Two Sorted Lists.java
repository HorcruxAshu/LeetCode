class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        int temporaryVariable;
        if(list2 == null){
            temporaryVariable = list1.val;
            list1 = list1.next;
        }else if(list1 == null){
            temporaryVariable = list2.val;
            list2 = list2.next;
        }else{
            if(list1.val < list2.val){
                temporaryVariable = list1.val;
                list1 = list1.next;
            }else{
                temporaryVariable = list2.val;
                list2 = list2.next;
            }
        }
        ListNode resultNode = new ListNode(temporaryVariable);
        ListNode dummyNode = resultNode;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode newDummyNode = new ListNode(list1.val);
                dummyNode.next = newDummyNode;
                dummyNode = dummyNode.next;
                list1 = list1.next;
                
            }else{
                ListNode newDummyNode = new ListNode(list2.val);
                dummyNode.next = newDummyNode;
                dummyNode = dummyNode.next;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            ListNode newDummyNode = new ListNode(list1.val);
            dummyNode.next = newDummyNode;
            dummyNode = dummyNode.next;
            list1 = list1.next;
        }
        while(list2 != null){
            ListNode newDummyNode = new ListNode(list2.val);
            dummyNode.next = newDummyNode;
            dummyNode = dummyNode.next;
            list2 = list2.next;
        }  
        return resultNode;
    }
}