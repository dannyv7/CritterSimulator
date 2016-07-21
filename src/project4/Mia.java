package project4;

public class Mia extends Critter{
	public Mia(){
		
	}
	@Override 
	public String toString(){
		return("M");
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
		if (oponent.equals("@")) {
			
		} else if (oponent.equals("C")) {
			
		} else if (oponent.equals("M")) {
			
		} else if (oponent.equals("L")) {
			
		} else if (oponent.equals("A")) {
			
		} else if (oponent.equals("K")) {
			
		} 
		return false;
	}

}
