package project4;
/**
 * A very balanced behavior Critter
 * Usually walks, rarely running or resting
 * Has no directional preferences
 * Always fights Algae
 * Will fight anyone if Energy >= 50
 * @author danny
 *
 */
public class Mia extends Critter{
	private int[] directionalPref = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};
	private int[] behavioralPref = new int[]{0, 1, 2, 1, 1, 1};
	public Mia(){
		
	}
	@Override 
	public String toString(){
		return("M");
	}
	
	@Override
	public void doTimeStep() {
		this.setMoved(false);
		int dir = directionalPref[getRandomInt(15)];
		int behavior = getRandomInt(5);
		if(behavioralPref[behavior] == 0){}
		else if(behavioralPref[behavior] == 1){walk(dir);}
		else if(behavioralPref[behavior] == 2){run(dir);}
		
		if(this.getEnergy() >= Params.min_reproduce_energy){
			Critter child = new Mia();
			reproduce(child, dir);
		}
		
		
	}

	@Override
	public boolean fight(String oponent) {
		if (oponent.equals("@")) {
			return true;
		} else if (oponent.equals("C")) {
			return this.getEnergy() >= 50;
		} else if (oponent.equals("M")) {
			return this.getEnergy() >= 50;
		} else if (oponent.equals("L")) {
			return this.getEnergy() >= 50;
		} else if (oponent.equals("A")) {
			return this.getEnergy() >= 50;
		} else if (oponent.equals("K")) {
			return this.getEnergy() >= 50;
		} 
		return false;
	}

}
