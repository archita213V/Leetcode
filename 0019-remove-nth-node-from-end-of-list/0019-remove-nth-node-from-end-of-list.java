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
    int getLength(ListNode head){
        int l=0;
        while(head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int L=getLength(head);
        if(n==L){
            return head.next;
        }
        int travel_front=L-n;
        ListNode temp=head;
        ListNode prev=null;
        while(travel_front-->0){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return head;
    }
}