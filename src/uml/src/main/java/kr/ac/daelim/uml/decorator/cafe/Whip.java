package kr.ac.daelim.uml.decorator.cafe;

public class Whip extends CondimentDecorator{

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", 휘핑크림";
	}

	@Override
	public int cost() {
		return beverage.cost()+300;
	}
	
}
