package project4;

public class Asa extends Critter{

	@Override
	public void doTimeStep() {
		int dir = getRandomInt(3)+4;
		run(dir);
		
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
	}

}
