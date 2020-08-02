package org.stackusingarray;

public class stackarray {
	
	public int arr[];
	public int size;
	public int currentsize;
	public int top;
	
	public stackarray(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		}

	public boolean isEmpty()
	{
		//System.out.println("stack is empty");
		return (top==-1);
				
	}
	public boolean isFull()
	{
		return (size-1==top);
	}
	
	public int peek()
	{
		if(!this.isEmpty())
		{
			System.out.println("top element "+arr[top]);
			return arr[top];
		}
		else
		{
			System.out.println("stack is empty");
		    return -1;
		    
		}
		
	}
	public void push(int element)
	{
		if(!this.isFull())
		{
		top++;
		arr[top] = element;
		System.out.println("added element "+arr[top]);
		currentsize++;
		System.out.println("currentsize of stack "+currentsize);
	//	return arr[top];
		}
		else
		{
			System.out.println("stack is full");
		}
	}
	public int pop()
	{
		if(!this.isEmpty())
		{
			int returnedtop=top;
		top--;
		System.out.println("deleted element "+arr[returnedtop]);
		currentsize--;
		System.out.println("currentsize of stack "+currentsize);
		return arr[returnedtop];
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackarray sa = new stackarray(10);
		sa.isEmpty();
		sa.push(100);
		sa.push(200);
		sa.push(300);
		sa.push(400);
		sa.push(500);
		sa.push(600);
		sa.push(700);
		sa.push(800);
		sa.push(900);
		sa.push(1000);
		sa.push(1000);
		sa.peek();
		sa.pop();
		sa.peek();
	}

}
