package Linked_List;

public class Q4_Reverse_Link_II_92 {
//     Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    class Solution {
        public ListNode reverseBetween (ListNode head,int left, int right){
            if(left == right){
                return head;
            }

            // skip the fist node
            ListNode prev = null;
            ListNode current = head;

            for (int i = 0; current != null && i < left-1; i++) {
                prev = current;
                current = current.next;
            }

            ListNode last = prev;
            ListNode newNode = current;

            // reverse between left and right
            ListNode Next = current.next;
            for (int i = 0; current != null && i < (right - left + 1); i++) {

                current.next = prev;
                prev = current;
                current = Next;

                if(Next != null){
                    Next = Next.next;
                }
            }

            //
            if(last != null){
                last.next = prev;
            }else {
                head = prev;
            }

            newNode.next = current;

            return head;
        }

    }
}
