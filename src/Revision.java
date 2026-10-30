import java.util.*;

class Node {

    int data;
    Node left;
    Node right;
    public Node(int data)
    {
      this.data= data;
      this.left=null;
      this.right=null;
    }
}
public class Revision
{
    public static List<Integer> preOrderTraversal(Node root1)
    {

        List<Integer> list = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        Node node = root1;
           while(true)
           {
               if(node!=null)
               {
                   stack.push(node);
                   node= node.left;
               }
               else {
                   if(stack.isEmpty())
                   {
                       break;
                   }
                   node = stack.pop();
                   list.add(node.data);
                   node= node.right;
               }
           }
          return list;
    }
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(6);
        root1.left.right.right.right = new Node(7);

        List<Integer> ans = preOrderTraversal(root1);
        System.out.println(ans);
    }

}
