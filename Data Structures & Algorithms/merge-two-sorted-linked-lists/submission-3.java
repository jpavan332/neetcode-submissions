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
        ListNode output = null;
        ListNode start = null;


        while(list1 != null && list2 != null){
            ListNode temp = new ListNode();
            if(list1.val <= list2.val){
                temp.val = list1.val;
                temp.next = null;
                list1 = list1.next;
            }else if(list2.val < list1.val){
                temp.val = list2.val;
                temp.next = null;
                list2=list2.next;
            }
            
            if(output == null && start == null){
                
                output = temp;
                start = temp;
            }else{
                // System.out.println("***temp***"+temp.val);
                output.next = temp;
                output = output.next;
                //  System.out.println("***output***"+output.val);
            }
           
        }

        if(list1 !=null){
            while(list1!=null){
                if(output == null && start == null){
                    output = list1;
                    start = output;
                    list1 = list1.next;
                    continue;
                }
                output.next = list1;
                output = output.next;
                list1=list1.next;
            }
        }
         if(list2 !=null){
            while(list2!=null){
                if(output == null && start == null){
                    output = list2;
                    start = output;
                    list2 = list2.next;
                    continue;
                }
                System.out.println("last loop lis2.val"+list2.val);
                output.next = list2;
                output = output.next;
                list2=list2.next;
                System.out.println("last loop output.val"+output.val);
            }
        }

        return start;
        
    }
}