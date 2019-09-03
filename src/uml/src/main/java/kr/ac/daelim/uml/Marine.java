package kr.ac.daelim.uml;

public class Marine extends Unit {
	protected int attackPower;
	public void move()
	{
		System.out.println("마린이 움직인다");
	}
	public void attack()
	{
		System.out.println("마린이 공격한다");
	}
	public void underAttack(Character character)
	{
		System.out.println("마린이 공격을 받는다");
	}
}
