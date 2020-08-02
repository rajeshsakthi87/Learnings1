package org.datatypelearning;

public class datatypelearn {
int a ,b;

	datatypelearn(int i, int j)
	{
		a = i;
		b=j;
	}
	void meth(datatypelearn o)
	{
		o.a*=2;
		o.b/=2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datatypelearn ob = new datatypelearn(15,20);
		//int a =15;
		//int b = 20;
		System.out.println("before " + ob.a + "  "+ob.b);
		ob.meth(ob);
		
		System.out.println("after " + ob.a + "  "+ob.b);
		int c = 10;
		c += c * 20;
		System.out.println(c);
	}

}
