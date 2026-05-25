package Linked_List;

public class Q3_Reverse_Linked_List_206 {
// Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  class Solution{
      public ListNode reverseList(ListNode head) {
          if (head == null || head.next == null) {
              return head;
          }

          ListNode Prev = null;
          ListNode Present = head;
          ListNode Next = head.next;

          // Reverse Linked List
          while (Present != null) {
              Present.next = Prev;

              Prev = Present;
              Present = Next;
              if (Next != null) {
                  Next = Next.next;
              }
          }

          return Prev;
      }
  }
}
