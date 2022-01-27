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
    public ListNode reverseList(ListNode head) {
        
        ListNode temp = head;
        List<Integer> vals = new ArrayList<Integer>();
        while(temp!=null){
            vals.add(temp.val);
            temp = temp.next;
        }
         temp = new ListNode();
        ListNode reverse_head = null ;
        if(vals.size()>0)
        reverse_head=  new ListNode(vals.get(vals.size()-1));
            
        for(int i=vals.size()-2; i>=0; i--){
            ListNode newnode = new ListNode(vals.get(i));
            temp = reverse_head;
            while(temp.next != null)
                temp = temp.next;
             
             temp.next = newnode;
            
        }
        return reverse_head;
    }
}
