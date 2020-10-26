import java.util.List;
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class ReverseList {

    public ListNode reverseListForMy(ListNode head) {
        ListNode  node =new ListNode( 0 ),cur,next;

        while(head.next!=null){
            cur=head.next;
            next=head;
            cur.next=next;
            node.next=cur;

            head=head.next;

        }

        return node.next;
    }
    public ListNode reverseList(ListNode head) {



        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
