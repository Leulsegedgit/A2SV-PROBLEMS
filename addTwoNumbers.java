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
import java.math.BigInteger;
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp2 = l2;
        String num1 = "";
        String num2 = "";
        while(temp!=null){
            num1+=String.valueOf(temp.val);
            temp = temp.next;
        }
        while(temp2!=null){
            num2+=String.valueOf(temp2.val);
            temp2 = temp2.next;
        }
        num1 = reverse(num1);
        num2 = reverse(num2);
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
       BigInteger sum = a.add(b);
        String sum_str = String.valueOf(sum);
        sum_str = reverse(sum_str);
        ListNode sumnode = new ListNode();
        sumnode.val = Integer.parseInt(""+sum_str.charAt(0));
        ListNode tempnode = new ListNode();
        for(int i=1; i<sum_str.length(); i++){
            
            tempnode = sumnode;
            while(tempnode.next!=null)
                tempnode = tempnode.next;
            ListNode newnode = new ListNode();
            
            newnode.val = Integer.parseInt(""+sum_str.charAt(i));
            tempnode.next = newnode;
            
            
        }
       return sumnode; 
    }
String reverse(String str){
    String nstr = "";
    char ch;
    for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
    return nstr;
}

}
