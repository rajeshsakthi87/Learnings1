package org.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Subclass extends SuperClass{
	
	public void method() throws RuntimeException
	{
		System.out.println("childclass ");
	}
}
