package project4;

public class Kennedy extends Critter{

	@Override
	public void doTimeStep() {
		
		int dir = getRandomInt(3)+4;
		walk(dir);
		
	}

	@Override
	public boolean fight(String oponent) {
		// TODO Auto-generated method stub
		return false;
	}

}
