import java.util.List;
import java.util.ArrayList;

public class Tree
{
   private Node root;

   class Node
   {
      public Object data;
      public List<Node> children;

      public int size()
      {
          int sum = 0;
          for (Node child : children) 
          { 
              sum = sum + child.size(); 
          }
          return 1 + sum;
      } 

      public String toString()
      {
         if (root.children.size() == 0)
         {
            return "(" + root.data + ")";
         }
         else
         {
            String temp = "(" + root.data;
            for (Object obj : root.children)
            { 
               temp = temp + obj.toString();
            }
            return temp = temp + ")";
         }
      } 
   }

   public Tree(Object rootData)
   {
      root = new Node();
      root.data = rootData;
      root.children = new ArrayList<Node>();
   }

   public void addSubtree(Tree subtree)
   {
      root.children.add(subtree.root);
   }

   public int size()
   {
      if (root == null) 
      {
         return 0;
      }
      else
      {
         return root.size();
      }
   }

   public String toString()
   {
      return root.toString();
   }
}