class Node  
{ 
    int data; 
    Node left, right; 
       
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
   
public class EvenNodes 
{ 
    Node root; 
   
   void BeginLevelOrder(Node node)  
    { 
        int h = height(node); 
        int i; 
        for (i = 1; i <= h; i++)  
        { 
	         if(i%2==0)
			 {
            printGivenLevel(node, i); 
			 }
        } 
    } 
   
    
  
    void printGivenLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1)  
        { 
            printGivenLevel(node.left, level - 1); 
            printGivenLevel(node.right, level - 1); 
        } 
    } 
   
   
    int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
   
    public static void main(String args[])  
    { 
        EvenNodes tree = new EvenNodes(); 
   
      
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
		           
        System.out.println(" EVEN Level Order  of binary tree is : "); 
        tree.BeginLevelOrder(tree.root); 
           
       
    } 
} 
   