package project4;

public class Mia extends Critter{
	public Mia(){
		
	}
	@Override
	public void doTimeStep() {
		int dir = getRandomInt(3);
		run(dir);
		
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
