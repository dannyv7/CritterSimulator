package project4;

public class Lexi extends Critter{
	
	@Override 
	public String toString(){
		return("L");
	}

	@Override
	public void doTimeStep() {
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Mia();
			reproduce(child, 0);
		}
		
	}

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
