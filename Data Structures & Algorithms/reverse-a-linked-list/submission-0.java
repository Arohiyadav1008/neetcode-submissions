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
        ListNode prev = null;
        ListNode curr = head;
        //curr = 1
        //prev = null
        // 1 -> null
        // 2 -> 1 -> null
        while(curr != null){     
        // curr.next means aage wala null nhi hona chayiye last se ek kam chalega     
        //curr!=null current wala null nhi hona chayiye last tak chalega
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
