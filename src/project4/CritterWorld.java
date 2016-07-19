package project4;
import java.util.*;
public class CritterWorld {
	private static ArrayList<Critter> liveCritters = new ArrayList<Critter>(0);
	private static  int numAlive = 0;
	
	public CritterWorld(){
		
	}
	
	/**
	 * Accessor method for the ArrayList of alive Critters *
	 * @return
	 * 	The ArrayList<Critter> which contains all live Critter objects 
	 */
	public static ArrayList<Critter> getLiveCritters(){
		return liveCritters;
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
