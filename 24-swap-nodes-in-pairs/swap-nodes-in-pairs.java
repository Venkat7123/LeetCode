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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode l1 = new ListNode(0);
        ListNode res = l1;
        ListNode safe;
        boolean even = true;
        while(curr != null && curr.next != null){
            safe = curr;
            // System.out.println(curr.val);
            l1.next = curr.next;
            // System.out.println(l1.val);
            // System.out.println(curr.next.val);
            l1 = l1.next;
            curr = curr.next.next;
            l1.next = safe;
            // System.out.println(l1.val);
            l1 = l1.next;
        }
        if(curr != null){
            l1.next = curr;
            
        }
        else
        l1.next = null;
        return res.next;
    }
}