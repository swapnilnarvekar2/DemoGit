package Polymorphism;

public class Dog extends Animal
{
	public void move()
	{
		System.out.println("Dog can walk");
	}

	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.move();
	}

}
