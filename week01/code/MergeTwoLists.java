  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

      public ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

      public ListNode() {

      }
  }

  public class MergeTwoLists {

      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


          ListNode node = new ListNode(), cur = node;

          while (l1 != null || l2 != null) {
              if (l1 != null && l2 != null) {
                  if (l1.val < l2.val) {
                      cur.next = l1;
                      l1 = l1.next;
                  } else {
                      cur.next = l2;
                      l2 = l2.next;
                  }

              } else if (l1 == null && l2 != null) {
                  cur.next = l2;
                  l2 = l2.next;
              } else if (l1 != null && l2 == null) {
                  cur.next = l1;
                  l1 = l1.next;
              }
              cur = cur.next;
          }
          return node.next;
      }
  }
