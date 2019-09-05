package kr.ac.daelim.uml.decorator.cafe;

public class Milk extends CondimentDecorator{

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", 우유";
	}

	@Override
	public int cost() {
		return beverage.cost()+500;
	}
	
}
