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
  public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy; // The last (largest) of the sorted list

    while (head != null) {       // Current inserting node
      ListNode next = head.next; // Cache next inserting node
      if (prev.val >= head.val)  // `prev` >= current inserting node
        prev = dummy;            // Move `prev` to the front
      while (prev.next != null && prev.next.val < head.val)
        prev = prev.next;
      head.next = prev.next;
      prev.next = head;
      head = next; // Update current inserting node
    }

    return dummy.next;
  }
}
