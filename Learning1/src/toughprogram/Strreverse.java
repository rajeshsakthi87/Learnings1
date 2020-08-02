package toughprogram;

public class Strreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mom";		
		char[] ch=name.toCharArray();
		String revname="";
		int len = name.length();
		for(int i=len-1; i>=0 ; i--)
		{
			System.out.println(ch[i]);
		revname = revname + ch[i];
		}
		System.out.println(revname);
		if(name.equalsIgnoreCase(revname)) 
		{
		System.out.println("given string is palindrome");	
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
		
		
		
	}

}
