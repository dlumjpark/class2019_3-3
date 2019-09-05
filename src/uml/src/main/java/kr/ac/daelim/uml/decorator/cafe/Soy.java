package kr.ac.daelim.uml.decorator.cafe;

public class Soy extends CondimentDecorator{

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", 두유";
	}

	@Override
	public int cost() {
		return beverage.cost()+400;
	}
	
}
