package kr.ac.daelim.uml;

public class Medic extends Unit{
	public void move() {
		System.out.println("메딕이 움직인다");
	}
	public void underAttack(Charactor charactor)
	{
		System.out.println("메딕이 공격을 받는다");
	}
	public void healing(Charactor charactor)
	{
		System.out.println("메딕이 치료한다");
	}
}
