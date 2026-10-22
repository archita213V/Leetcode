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
    ListNode mergeTwoList(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<list2.val){
            list1.next=mergeTwoList(list1.next,list2);
            return list1;
        }
        else{
            list2.next=mergeTwoList(list1,list2.next);
            return list2;
        }
        
    }
    ListNode partitionAndmerge(int s,int e,ListNode[] lists){
        if(s>e){
            return null;
        }
        if(s==e){
            return lists[s];
        }
        int mid=s+(e-s)/2;
        ListNode left=partitionAndmerge(s,mid,lists);
        ListNode right=partitionAndmerge(mid+1,e,lists);
        return mergeTwoList(left,right);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0){
            return null;
        }
        return partitionAndmerge(0,k-1,lists);
    }
}