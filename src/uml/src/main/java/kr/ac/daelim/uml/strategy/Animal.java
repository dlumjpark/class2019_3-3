package kr.ac.daelim.uml.strategy;

public abstract class Animal {
	IFly fly;
	ICry cry;
	public Animal() {
		//생성자
	}
	public void display()
	{
		System.out.println("Animal: display()");
	}
	public void move() {
		System.out.println("Animal: move()");
	}
	public void performFly() {
		fly.fly();
	}
	public void performCry() {
		cry.cry();
	}
}
