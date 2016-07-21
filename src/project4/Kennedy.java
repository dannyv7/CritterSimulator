package project4;

public class Kennedy extends Critter{
	
	@Override 
	public String toString(){
		return("K");
	}

	@Override
	public void doTimeStep() {
		
		int dir = getRandomInt(3)+4;
		walk(dir);
		
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Mia();
			reproduce(child, dir);
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
