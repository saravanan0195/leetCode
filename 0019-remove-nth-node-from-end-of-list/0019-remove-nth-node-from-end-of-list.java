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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode newHead = new ListNode(-1);
        newHead.next = head;
        dfs(newHead, n + 1);
        return newHead.next;
    }
    public int dfs(ListNode node, int k) {
        if (node == null) return 0;
        int index = 1 + dfs(node.next, k);
        if (index == k) {
            node.next = node.next.next;
        }
        return index;
    }
}