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
    public int pairSum(ListNode head) {
       Stack<Integer>st=new Stack<>();
       ListNode curr=head;
       while(curr!=null){
        st.add(curr.val);
        curr=curr.next;
       }
       curr=head;
       int N=st.size();
       int result=0;
       for(int i=0;i<N/2;i++){
        result=Math.max(result,curr.val+st.pop());
        curr=curr.next;
       }
       return result;
    }
}