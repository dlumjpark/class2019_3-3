package kr.ac.daelim.uml;

public class LegacyMarine {
	private String name;
	public int health;
 	protected int attackPower;
 	private void Move() {
 		System.out.println("마린이 움직인다");
 	}
 	public void Attack() {
 		System.out.println("마린이 공격한다"); 		
 	}
 	public void UnderAttack(Charactor charactor) {
 		System.out.println("마린이 공격을 받는다");
 	}
}
