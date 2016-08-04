/* CRITTERS Algae.java
 * EE422C Project 4 submission by
 * Replace <...> with your actual data.
 * Danny Vo
 * dpv292
 * 76550
 * Zain Modi
 * zam374
 * 76550
 * Slip days used: 1
 * Summer 2016
 */

package project4;

import project4.Critter.TestCritter;

public class Algae extends TestCritter {
	public CritterShape viewShape(){
		return CritterShape.STAR;
	}
	
	public Color viewFillColor(){
		return Color.GREEN;
	}
	
	public Color viewOutlineColor(){
		return Color.BLACK;
	}
	public String toString() { return "@"; }
	
	public boolean fight(String not_used) { return false; }
	
	public void doTimeStep() {
		setEnergy(getEnergy() + Params.photosynthesis_energy_amount);
	}
}
