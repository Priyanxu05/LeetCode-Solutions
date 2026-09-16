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
    public boolean isPalindrome(ListNode head) {
        if(head == null)return false;
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p=slow;;
        ListNode pre=null;
        while(p!=null){
            ListNode next=p.next;
            p.next=pre;
            pre=p;
            p=next;
        }
        ListNode t=head;
        while(pre!=null){
            if(t.val != pre.val)return false;
            t=t.next;
            pre=pre.next;
        }
        return true;
        
    }
}