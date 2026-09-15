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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        while(head!=null&&head.val==val){
            head=head.next;
        }
        if (head == null) return null;

        ListNode p=head;
        ListNode t=p;
        while(p != null ){
            if(p.val == val){t.next=p.next;
            p=p.next;}
            else{t=p;
            p=p.next;
            }
        }
        return head;
    }
}