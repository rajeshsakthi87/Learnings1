package org.newpack;

public class TestCount implements Count {
public static int counter1=0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestCount p = new TestCount();

//System.out.println(p.counter);
System.out.println(Count.counter);
p.countup();

	}

	@Override
	public void countup() {
		// TODO Auto-generated method stub
	for (int x =6;x>counter1;x--,++counter1)
{
		System.out.println(x);
System.out.println("val " + counter1);
	}
	}

}
