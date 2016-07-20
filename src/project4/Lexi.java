package project4;

public class Lexi extends Critter{

	@Override
	public void doTimeStep() {
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Mia();
			reproduce(child, 0);
		}
		
	}

	@Override
	public boolean fight(String oponent) {
		if (oponent.equals("Algae")) {
			
		} else if (oponent.equals("Craig")) {
			
		} else if (oponent.equals("Mia")) {
			
		} else if (oponent.equals("Lexi")) {
			
		} else if (oponent.equals("Asa")) {
			
		} else if (oponent.equals("Kennedy")) {
			
		} 
		return false;
		return false;
	}

}
