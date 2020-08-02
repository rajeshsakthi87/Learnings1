package org.newpack;

public class footest {

	int size =7;
	static void changeIt(int size)
	{
		size=size+7;
		System.out.println(size);
	}
	static void run()
	{
		//size=size+7;
		System.out.println("size");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		footest ft = new footest();
		footest.changeIt(2);
		System.out.println(ft.size);
		ft.changeIt(ft.size);
		System.out.println(ft.size);
		
		int a = 56;
        int b = -8;
        int c = a / b;
        int d = b % a;
        System.out.println(c + ", " + d);
        
        int a1 = 0152;
        a1 *= 10 ;
        System.out.println("a=" + a1);

        short s = 10;
        int a2 = s;
        s += 10;
        System.out.println(s + "," + a2);
        
        boolean A = true;
        boolean B = false;
        System.out.println("A | B "+(A | B) + " ");
        
        boolean lampX = true, result;
        boolean lampY = false;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY & lampX;
        System.out.println("Lamp switch-on " + result);
        
        boolean a3 = true;
        boolean b3 = true;
        boolean c3 = a3 & b3;
        System.out.println(c3);
        boolean d3 = a3 ^ b3;
	System.out.println(d3);
	}

}
