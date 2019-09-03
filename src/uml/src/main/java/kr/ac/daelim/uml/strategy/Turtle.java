package kr.ac.daelim.uml.strategy;

public class Turtle extends Animal{

	IFly fly;
	ICry cry;

	public Turtle() {
		cry = new CryNoWay();
		fly = new FlyNoWay();
	}
	@Override
	public void performCry() {
		cry.cry();
	}
	@Override
	public void performFly() {
		fly.fly();
	}
	
	@Override
	public void display() {
		System.out.println("거북이 모습");
	}
	
	@Override
	public void move() {
		System.out.println("거북이 이동");
	}
}
