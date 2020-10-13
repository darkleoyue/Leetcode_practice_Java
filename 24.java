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

    public ListNode swapTwo(ListNode node0){
        ListNode node1 = node0.next;
        ListNode node2 = node1.next;
        ListNode node3 = node2.next;
        node2.next = node1;
        node1.next = node3;
        node0.next = node2;
        return node1;
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode res = head.next;
        ListNode node0 = new ListNode(0, head);
        while(node0.next != null && node0.next.next != null){
            node0 = swapTwo(node0);
        }
        return res;        
    }
}
