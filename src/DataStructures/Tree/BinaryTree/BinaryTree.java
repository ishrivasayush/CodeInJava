package DataStructures.Tree.BinaryTree;

public class BinaryTree {
    Node root;


    public void insert(int data)
    {
         root=insertRec(data,root);
    }
    public Node insertRec(int data,Node root)
    {
        if (root==null)
        {
            root=new Node(data);
        }
        else if(data> root.data)
        {
            root.right=insertRec(data,root.right);
        }
        else if(data< root.data)
        {
            root.right=insertRec(data,root.left);
        }

        return root;
    }
    public void in()
    {
        inOrder(root);
    }

    public void inOrder(Node root)
    {
        if (root != null)
        {
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
    }
    public void preOrder(Node root)
    {
        if (root != null)
        {
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node root)
    {
        if (root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+" ");
        }
    }
}
