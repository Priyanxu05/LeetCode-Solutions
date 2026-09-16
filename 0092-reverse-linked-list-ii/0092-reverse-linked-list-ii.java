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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left == right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        int size=0;
        while(p.next !=null){
            size++;
            p=p.next;
        }
        p=dummy;
        ListNode l=null;
        ListNode ll=null;
        ListNode rr=null;
        for(int i=1;i<=size;i++){
            if(i==left){
                l=p;
                ll=p.next;
            }
            if(i == right){
                rr=p.next;
            }
            p=p.next;}

            ListNode pre=null;
            ListNode cur=ll;
            ListNode after = rr.next;
            while(cur!= after){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        ll.next=after;
        l.next=pre;

        return dummy.next;
    }
}