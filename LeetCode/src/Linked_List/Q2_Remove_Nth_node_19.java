package Linked_List;

public class Q2_Remove_Nth_node_19 {
    // give in leetcode
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // Main solution:
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }
        ListNode temp = head;
        ListNode ptr = head;

        //Move ptr forward n time
        int i = 1;
        while(i <= n){
            ptr = ptr.next;
            i++;
        }

        if(ptr == null){  // ptr = null then return the head.next node
            return head.next;
        }

        // move both until ptr reach the last node
        while(ptr.next != null){
            ptr = ptr.next;
            temp = temp.next;
        }

        // skip the nnt node form end.
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
}
