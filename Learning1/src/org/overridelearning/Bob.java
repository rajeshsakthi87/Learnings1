package org.overridelearning;

public class Bob {

	int shoesize;
	String nickname;
	Bob(String nickname, int shoesize)
	{
		this.nickname=nickname;
		this.shoesize=shoesize;
		
	}
	public String toString()
	{
		return "I am " + nickname + " my shoe size " + shoesize;
	}
}
