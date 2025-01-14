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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next==null){
            return head;
        }
       ListNode curr = head;
       ListNode evenStart = head.next;
       ListNode odd = head;
       ListNode even = head.next;
       while(even!=null ){
        odd.next=even.next;
        even.next=even.next.next;
        odd=odd.next;
        even=even.next;
       }
       odd.next=evenStart;
       return curr;
    }

}