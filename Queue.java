package question1;

public class Queue
{	final int SIZE=12;
	private int queue[]=new int[SIZE];
	public int head;
	public int tail;
	private boolean ifEnqueue;
	public Queue()
	{	head=0;
		tail=0;
		ifEnqueue=false;
	}
	public void enQueue(int x)
	{	if(this.ifOverflowError())
			return;
		queue[tail]=x;
		if(tail==SIZE-1)
			tail=0;
		else
			tail=tail+1;
		ifEnqueue=true;
	}
	public int deQueue()
	{	if(this.ifUnderflowError())
			return 0;
		int x=queue[head];
		if(head==SIZE-1)
			head=0;
		else
			head=head+1;
		ifEnqueue=false;
		return x;
	}
	public boolean ifOverflowError()
	{	if(head==tail&&ifEnqueue)
		{	System.out.println("queue overflow");
			return true;
		}	
		return false;
	}
	public boolean ifUnderflowError()
	{	if(head==tail&&!ifEnqueue)
		{	System.out.println("queue underflow");
			return true;
		}
		return false;
		
	}
	public void display()
	{	if(head<tail)
		{	for(int i=head;i<tail;i++)
				System.out.print(queue[i]+" ");
		}
		else if(head==tail)
		{	for(int i=0;i<SIZE;i++)
				System.out.print(queue[i]+" ");
		}
		else
		{	for(int i=0;i<tail;i++)
				System.out.print(queue[i]+" ");
			for(int i=tail;i<head;i++)
				System.out.print("X ");
			for(int i=head;i<SIZE;i++)
				System.out.print(queue[i]+" ");
		}
	}
	public int returnMaxSize()
	{
		return SIZE;
	}

}
