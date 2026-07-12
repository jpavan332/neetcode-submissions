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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode output = new ListNode();
        ListNode start = output;
        while(list1 != null && list2 != null){
            // ListNode temp = new ListNode();
            if(list1.val <= list2.val){
                start.next = list1;
                list1 = list1.next;
            }else if(list2.val < list1.val){
                start.next = list2;
                list2=list2.next;
            }
            start = start.next;
           
        }

        if(list1 !=null){
            // while(list1!=null){
            //     if(output == null && start == null){
            //         output = list1;
            //         start = output;
            //         list1 = list1.next;
            //         continue;
            //     }
                start.next = list1;
                // output = output.next;
                // list1=list1.next;
            // }
        }
         if(list2 !=null){
            // while(list2!=null){
            //     if(output == null && start == null){
            //         output = list2;
            //         start = output;
            //         list2 = list2.next;
            //         continue;
            //     }
                start.next = list2;
                // output = output.next;
                // list2=list2.next;
            // }
        }

        return output.next;
        
    }
}