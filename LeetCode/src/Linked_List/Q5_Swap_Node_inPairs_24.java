package Linked_List;

public class Q5_Swap_Node_inPairs_24 {
    // Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
//        Method: 1
        public ListNode swapPairs(ListNode head) {
            if(head == null && head.next == null){
                return head;
            }

            ListNode dummy = new ListNode(0);
            ListNode point = dummy;

            while(point.next != null && point.next.next != null){
                ListNode node1 = point.next; // point the first node
                ListNode node2 = point.next.next; // point the second node

                // swap
                node1.next = node2.next;
                node2.next = node1;

                // changing the point:
                point.next = node2;
                point = node1;
            }
            return dummy.next;
        }

        // Method: 2
        //  BY USING REACTION (TC: O(N))
//        public ListNode swapPairs(ListNode head) {
//
//            if(head == null || head.next == null){
//                return head;
//            }
//
//            ListNode cur = head;
//            for(int i = 0; cur != null && i < 2; i++){
//                cur = cur.next;
//            }
//
//            ListNode newHead = reverse(head, cur);
//
//            head.next = swapPairs(cur);
//
//            return newHead;
//        }
//        public ListNode reverse(ListNode head, ListNode end){
//            ListNode prev = null;
//            ListNode current = head;
//
//            while(current != end){
//                ListNode Next = current.next;
//
//                current.next = prev;
//                prev = current;
//                current = Next;
//            }
//            return prev;
//        }
    }
}
