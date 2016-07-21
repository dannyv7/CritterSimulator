package project4;

public class Mia extends Critter{
	public Mia(){
		
	}
	@Override
	public void doTimeStep() {
		int dir = getRandomInt(3);
		run(dir);
		
		
	}

	@Override
	public boolean fight(String oponent) {
		// TODO Auto-generated method stub
		return false;
	}

}
