package project4;

public class Kennedy extends Critter{

	@Override
	public void doTimeStep() {
		
		int dir = getRandomInt(3)+4;
		walk(dir);
		
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Mia();
			reproduce(child, dir);
		}
	}

	@Override
	public boolean fight(String oponent) {
		// TODO Auto-generated method stub
		return false;
	}

}
