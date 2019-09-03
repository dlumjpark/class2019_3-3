package kr.ac.daelim.uml;

public class UnitExecutor {
	public static void main(String[] args) {
		Unit unit = new Unit();
		unit.move();
		
		Marine marine = new Marine();
		marine.move();
		marine.attack();

		Medic medic = new Medic();
		medic.move();
		medic.healing(null);
	}
}
