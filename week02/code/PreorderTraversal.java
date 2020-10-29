import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
          this.right = right;
      }
  }

 public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList(  );
          this.getChild(root,list);

        return list;

    }

     private void getChild(TreeNode root, List<Integer> list) {
        if (root==null){
            return;
         }else {
            list.add( root.val );
        }

        if (root.left!=null){
            this.getChild( root.left,list );
        }
        if (root.right!=null){
            this.getChild( root.right,list );
        }
     }
 }
