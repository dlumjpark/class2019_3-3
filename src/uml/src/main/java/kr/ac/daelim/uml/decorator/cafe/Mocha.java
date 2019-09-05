package kr.ac.daelim.uml.decorator.cafe;

public class Mocha extends CondimentDecorator{

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", 모카";
	}

	@Override
	public int cost() {
		return beverage.cost()+600;
	}
	
}
