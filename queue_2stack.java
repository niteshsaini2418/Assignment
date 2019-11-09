package linking;

class queue_2stack {
	static Node top;
static class Node{
	int data;
	Node next;
    }
    queue_2stack(){
	this.top=null;
    }
    public static void push(int d)
    {
    	Node n=new Node();
    	if(n==null)
    	{
    		System.out.println("overflow");
    	}
    	else {
    		n.data=d;
    		n.next=top;
    		top=n;
    	}
    }
    public static void enqueue(int d)
    {
    	push(d);
    }
    
    public static queue_2stack pop(queue_2stack q)
    {
    	Node t = null;
    	if(q==null)
    	{
    		System.out.println("queue empty");
    	}
    	else
    	{
    	    t = q.top;
    		q.top=q.top.next;
    	}
    	queue_2stack r=null;
    	r.top=t;
    	return r;
    }
    public static void dequeue(queue_2stack q)
    {
    	queue_2stack l=null;
    	while(q.top.next!=null)
    	{
         l=pop(q);
         System.out.println(l.top.data);
         q.top=q.top.next;
        }
   
    }
   public static void display(queue_2stack q)
    {
    	while(q.top!=null)
    	{
    		System.out.println(q.top.data);
    		q.top=q.top.next;
    	}
    }
	public static void main(String args[]) {
		// TODO Auto-generated method stub
        queue_2stack q=new queue_2stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue(q);
        q.display(q);
        
	}

}
