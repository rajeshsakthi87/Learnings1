package obiinstancelearners;

public class objlearners {
	String name = "dataflair";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class cl = Class.forName("objlearners");
	objlearners obj = (objlearners)cl.newInstance();
	System.out.println(obj.name);
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
