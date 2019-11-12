class preoderToInorderPostorder { 
  
  
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  

    Node root; 
  
   
    preoderToInorderPostorder() {  
        root = null;  
    } 
  
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    Node insertRec(Node root, int key) { 
  
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
  
  
    void inorder()  { 
       inorderRec(root); 
    } 
	
	void postorder()
	{
		postorder(root);
	}
  
  
    void inorderRec(Node root) { 
        if (root != null) {
			inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
	
	void  postorder(Node root)
	{
		if(root != null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key);
		}
	}
  
  
    public static void main(String[] args) { 
        preoderToInorderPostorder tree = new preoderToInorderPostorder(); 

      
        tree.insert(90); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(55); 
        tree.insert(70); 
        tree.insert(10); 
        tree.insert(60); 
  
     	  System.out.println("Inorder of given Tree :");
        tree.inorder();
          
	
         
		 	  System.out.println("Postorder of given Tree :");
          tree.postorder();		  
    } 
} 