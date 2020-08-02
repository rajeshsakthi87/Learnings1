package org.exceptions;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SuperClass sc = new Subclass();
		sc.method();
	}

}
