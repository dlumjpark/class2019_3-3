package kr.ac.daelim.uml.strategy;

public class Eagle extends Animal{

	IFly fly;
	ICry cry;

	public Eagle() {
		cry = new BirdCry();
		fly = new FlyWithWings();
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
		System.out.println("독수리 모습");
	}
	
	@Override
	public void move() {
		System.out.println("독수리 이동");
	}
}
