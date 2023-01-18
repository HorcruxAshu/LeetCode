/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temporaryNode = null;
        ListNode otherNode = head;
        while(otherNode != null){
            ListNode originalNextOfOtherNode = otherNode.next;
            otherNode.next = temporaryNode;
            temporaryNode = otherNode;
            otherNode = originalNextOfOtherNode;
        }
        return temporaryNode;
    }
}