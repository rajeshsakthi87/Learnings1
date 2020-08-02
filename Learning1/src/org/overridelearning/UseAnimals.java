package org.overridelearning;

public class UseAnimals {

	public void dostuff(Animal a)
	{
		System.out.println("Animal version");
	}
	public void dostuff(Horse b)
	{
		System.out.println("Horse version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseAnimals ua = new UseAnimals();
		Animal a = new Animal();
		Horse h = new Horse();
		Animal c = new Horse();
		ua.dostuff(a);
		ua.dostuff(h);
		ua.dostuff(c);
		a.eat();
		Animal h1 = new Horse();
		System.out.println(h1.anieat);
		h1.eat();
	}

}
