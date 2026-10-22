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
    int findLength(ListNode head){
        int l=0;
        while(head!=null){
            head=head.next;
            l++;
        }
        return l;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int L=findLength(head);
        //find node1
        int k1=k;
        ListNode node1=head;
        while(k1>1){
            node1=node1.next;
            k1--;
        }
        //find node2
        int k2=L-k+1;
        ListNode node2=head;
        while(k2>1){
            node2=node2.next;
            k2--;
        }
        // swap
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
        return head;

    }
}