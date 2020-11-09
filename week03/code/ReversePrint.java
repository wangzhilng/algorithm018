import java.util.Stack;

public class ReversePrint {


        public int[] reversePrint(ListNode head) {
            Stack<ListNode> stack=new Stack();
            ListNode  tem  =head;
            while(tem!=null){
                stack.push( tem );
                tem=tem.next;


            }
            int[] num =new int[stack.size()];
            for (int i=0;i<stack.size();i++){
                num[i]=stack.pop().val;

            }


        return num;


        }

}
