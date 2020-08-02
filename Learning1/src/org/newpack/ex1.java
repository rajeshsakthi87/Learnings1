package org.newpack;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34;
        int b = 21;
        int c = a++ + ++b;
        System.out.println(a + " "+b);
        System.out.println(c);
        int d = --a + --b + c--;
        System.out.println(a + " "+b);
        System.out.println(d);
        int e = a + +b + +c + d--;
        System.out.println(a + " "+b);
        System.out.println(e);
        int f = -a + b-- + -c - d++;
        System.out.println(a + " "+b+ " "+c+ " "+d + " "+e);
        System.out.println(f);
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);        
        int w=10;
        int x=10;
        int y=10;
        int z=10;
        int g = -w + x-- + -y - z++;
      //  -10+10-10-10
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(g);       
        int dailywage = 4;
        int number_of_days = 5;
        int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
        salary += dailywage;
        System.out.println(dailywage + " " + number_of_days + " " + salary);        
        int i=10;
        int j=20;
        int k =5;
        System.out.println(i++ + j - i + k);
        
	}

}
