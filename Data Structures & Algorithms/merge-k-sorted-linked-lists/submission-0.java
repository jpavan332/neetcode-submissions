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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(a.val - b.val));

        for(int i = 0; i< lists.length; i++){
            if(lists[i]!=null){
                pq.offer(lists[i]);
            }
        }
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            if(node.next!=null){
                pq.offer(node.next);
            }
        }
    return temp.next;
    }
}
