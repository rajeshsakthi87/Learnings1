package org.objcreation;

public class objcreator {

	private String name = "stri";
	private String name1= "str";
	public static void main(String[] args){
	
		
		Class cl;
		try {
			objcreator obj = new objcreator();
			System.out.println(obj.name);
			cl = Class.forName("objcreator");
			try {
				@SuppressWarnings("deprecation")
				objcreator obj1 = (objcreator)cl.newInstance();
				System.out.println(obj1.name);
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
