class Node { 
    int data; 
    Node left, right; 
  
    public Node(int d) 
    { 
        data = d; 
        left = right = null; 
    } 
} 
  
class BinaryTree { 
    Node root; 
  

    void printSpiral(Node node) 
    { 
        int h = height(node); 
        int i; 
  
    
         
        for (i = 1; i <= h+1; i++) { 
		
            printGivenLevel(node, i); 
		
		
        } 
    } 
  

    int height(Node node) 
    { 
        if (node == null) 
            return 0; 
        else { 
  
          
            int lheight = height(node.left); 
            int rheight = height(node.right); 
  
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
          public static void leveltransversalorder(Node root,int level)
          {
                if(root==null)
                {
                  return;
                    }
             else if(level==1)
                 {
                    System.out.print(root.data+" ");
                  }
              else if(level>1)
                 {
                leveltransversalorder(root.left,level-1);
                     leveltransversalorder(root.right,level-1);
                        }
                }
  
    void printGivenLevel(Node node, int level) 
    { 
         if (node == null) 
            return; 
        else if (level == 1) 
		{
            System.out.print(node.data + " ");
		}			
	else if(level%2!=0)
	{
               leveltransversalorder(node.left, level - 1); 
               leveltransversalorder(node.right, level - 1); 
	}
	else if(level%2==0)
	{
		               leveltransversalorder(node.right, level - 1); 
                       leveltransversalorder(node.left, level - 1); 
	}
    } 
	
		
	
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(7); 
        tree.root.left.right = new Node(6); 
        tree.root.right.left = new Node(5); 
        tree.root.right.right = new Node(4); 
        System.out.println("Spiral order traversal of Binary Tree is "); 
        tree.printSpiral(tree.root); 
    } 
} 