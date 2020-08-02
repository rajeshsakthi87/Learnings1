package toughprogram;

import java.util.Arrays;
//program to convert string into k substring, sort it and print it
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "welcometojava";
int l = a.length();
String[] arr = new String[l-2];
for(int i =0;i<l-2;i++)
{
	arr[i]=a.substring(i,i+3);
}
for(int j = 0 ; j<arr.length;j++)
{
	System.out.print(arr[j] + " ");
}
Arrays.sort(arr);
System.out.println();
for(int j = 0 ; j<arr.length;j++)
{
	System.out.print(arr[j] + " " );
}
System.out.println();
System.out.println(arr[0]);
System.out.println(arr[arr.length-1]);
	}

}
