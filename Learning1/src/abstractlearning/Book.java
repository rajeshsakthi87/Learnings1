package abstractlearning;

 abstract class Book {
	String title;
	Book()
	{
		System.out.println("hello");
	}
	abstract void setTitle(String s);
	String getTitle(){
		return title;
}
}
