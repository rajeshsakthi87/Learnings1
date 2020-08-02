package org.learnings;

import java.util.Date;

public class Testlearner {
int inputint;
String inputstr;
float inputflt;
double inputdb;
char inputch;
long inputlng;
Date dt;
public String gettitle()
{
	return inputstr;
}

static int[] inputarr = new int[] {1,2};
static int[] intp = new int[5];
static int [] arrchek;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Testlearner tl = new Testlearner();
//String b = tl.inputstr;
//String c = b.toUpperCase();
boolean x = true;
if(x)
{
System.out.println("hi");
}
for(int i =0; i<inputarr.length;i++)
{
	System.out.println("array "+ inputarr[i]);
}
int j;
String name;
//System.out.println(name);
		/*
		 * if(args[1]!=null) { j=7; }
		 */
//System.out.println(j);
Date date=null;
if(date==null)
{
	System.out.println("date is null");
}
System.out.println("date "+ tl.dt);
System.out.println("int " + tl.inputint);
System.out.println("string " + tl.inputstr);
System.out.println("string1 " + tl.inputstr);
System.out.println("float " + tl.inputflt);
System.out.println("double "+ tl.inputdb);
System.out.println("ch" + tl.inputch);
System.out.println("long " + tl.inputlng);


int[] arrchek = new int[10];
for(int i =0; i<arrchek.length;i++)
{
	System.out.println("array "+ arrchek[i]);
}

char c =064770;
char d = 'f';
char e= 0xbeef;
//char c3 = \u0022;
//char c4 = '\iface';
char c4 = '\uface';
int [] [] RNE = new int [2][2];
System.out.println(RNE[0][0]);
System.out.println(RNE[0][1]);
System.out.println(RNE[1][0]);
System.out.println(RNE[1][0]);

	}

}
