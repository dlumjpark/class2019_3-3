package kr.ac.daelim.uml.decorator.cafe;

public class Esopresso extends Beverage{

	public Esopresso() {
		this.description = "에소프레소";
	}
	
	@Override
	public int cost() {
		return 2000;
	}
}
