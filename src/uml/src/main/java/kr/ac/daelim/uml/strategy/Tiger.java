package kr.ac.daelim.uml.strategy;

public class Tiger extends Animal{

	IFly fly;
	ICry cry;

	public Tiger() {
		cry = new TigerCry();
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
		System.out.println("호랑이 모습");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이 이동");
	}
}
