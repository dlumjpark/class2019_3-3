package kr.ac.daelim.uml.strategy;

public class Zoo {
	public static void main(String[] args) {
		Animal tiger = new Tiger();
		tiger.performCry();
		tiger.performFly();
		tiger.display();
		tiger.move();
		
		Animal eagle = new Eagle();
		eagle.performCry();
		eagle.performFly();
		eagle.display();
		tiger.move();
	}
}
