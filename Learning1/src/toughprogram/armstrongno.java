package toughprogram;

public class armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String val = "153";

int neval = Integer.parseInt(val);
//char[] ch = val.toCharArray();
int vallen = val.length();
int sum = 0;
for(int i = 0;i<=vallen-1;i++)
{
	int k =1;
	String va = String.valueOf(val.charAt(i));
	for(int j = 3 ; j>0 ; j--)
	{
		k = k * Integer.valueOf(va);
		System.out.println(k);
	}
	sum = sum + k;
}
System.out.println(sum);
if(sum==neval)
{
	System.out.println("the given is amstrong");
}
else
{
	System.out.println("the given is amstrong");
}
	}

}
