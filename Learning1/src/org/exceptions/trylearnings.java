package org.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class trylearnings {

	void run()
	{		
	try (FileInputStream fip = new FileInputStream(new File("C:\\Users\\Rajesh\\newneonworkspace\\Test.xlsx")))
	{
		System.out.println("file found");
	}
	catch(IOException e)
	{
		System.out.println("file not found");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trylearnings tr =new trylearnings();
		tr.run();
	}

}
