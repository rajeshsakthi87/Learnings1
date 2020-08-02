package org.stackusingarray;

public class queueusingarray {
	int queuearray[];
	int front;
	int rear;
	int currentsize;
	int capacity;
	
	queueusingarray(int capacity)
	{
		this.capacity=capacity;
		this.queuearray=new int[capacity];
		this.front=0;
		this.rear=-1;
	}
	public void enqueue(int element)
	{
		if(!this.isfull())
		{
			rear++;
			if(rear==capacity-1)
			{
				rear=0;
				
			}
			queuearray[rear]=element;
			currentsize++;
			System.out.println(element + " added to the queue");
		}
		else
		{
			System.out.println("queue is full");
		}
		
	}
	public void dequeue()
	{
		if(!this.isempty())
		{
			front++;
			if(front==capacity-1)
			{
				System.out.println(queuearray[front-1]+ " removed from the queue");
				front=0;
				
			}
			else {
				System.out.println(queuearray[front-1]+ " removed from the queue");
			}
			currentsize--;
		}
		else
		{
			System.out.println("queue is empty");
		}
		
	}
	public boolean isfull()
	{
		if(currentsize==capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isempty()
	{
		if(currentsize==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueusingarray qua = new queueusingarray(5);
		qua.enqueue(100);
		qua.enqueue(200);
		qua.enqueue(300);
		qua.enqueue(400);
		qua.enqueue(500);
		qua.dequeue();
		
		
	}

}
