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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode safe = null;
        ListNode prev = null;
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        if(count < k) return head;
        count = 0;
        curr = head;
        while(count < k){
            safe = curr.next;
            curr.next = prev;
            prev = curr;
            curr = safe;
            count++;
        }
        if(curr != null) head.next = reverseKGroup(curr, k);
        return prev;
    }
}