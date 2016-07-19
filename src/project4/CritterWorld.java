package project4;
import java.util.*;
public class CritterWorld {
	private static ArrayList<Critter> liveCritters = new ArrayList<Critter>(0);
	private static  int numAlive = 0;
	
	public CritterWorld(){
		
	}
	
	/**
	 * Adds a critter to the world 
	 * @param c
	 * 	Subclass of Critter
	 */
	public static void addCritter(Critter c){
		liveCritters.add(c);
	}
}
