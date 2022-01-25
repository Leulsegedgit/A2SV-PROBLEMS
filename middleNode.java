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
    public ListNode middleNode(ListNode head) {
        int size = 1;
        int middle = 0;
        ListNode temp_node = head;
        while(temp_node.next!=null){
            size++;
            temp_node = temp_node.next;
        }
        if(size%2==0)
            middle = (size/2)+1;
        else
            middle = (size+1)/2;
            
        temp_node = head;
        for(int i=1; i<middle; i++){
            temp_node = temp_node.next;
        }
        
        return temp_node;
    }
}
