package project4;

public class Asa extends Critter{

	@Override
	public void doTimeStep() {
		int dir = getRandomInt(3)+4;
		run(dir);
		
	}

	@Override
	public boolean fight(String oponent) {
		// TODO Auto-generated method stub
		return false;
	}

}
