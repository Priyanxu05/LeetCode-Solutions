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
        if(head == null)return null;
        
        ListNode p=head;

        int size=0;
        while(p != null){
            size++;
            p=p.next;}
        p=head;

        if (n==size)return head.next;
        for(int i=0;i<size - n -1;i++){
            p=p.next;
        }
        p.next=p.next.next;

        return head;
    }
}