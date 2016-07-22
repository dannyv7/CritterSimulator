/* CRITTERS CritterWorld.java
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
import java.util.*;
public class CritterWorld {
	private static LinkedList<Critter> liveCritters = new LinkedList<Critter>();
	private static ArrayList<Critter> crib = new ArrayList<Critter>(0);
	private static  int numAlive = 0;
	private static Critter[][] world = new Critter[Params.world_width][Params.world_height];
	
	
	/**
	 * Accessor method for the ArrayList of alive Critters *
	 * @return
	 * 	The ArrayList<Critter> which contains all live Critter objects 
	 */
	public static LinkedList<Critter> getLiveCritters(){
		return liveCritters;
	}
	
	public static Critter[][] getWorld(){
		return world;
	}
	
	public static void addToCrib(Critter c){
		crib.add(c);
	}
	
	
	
	/**
	 * Deletes all dead Critters (energy <= 0) from the list of alive Critters
	 */
	public static void removeDeadCritters(){
		LinkedList<Critter> step = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = step.iterator();
		Critter next;
		
		while (itr.hasNext()) {
			next = itr.next();
			if(next.getEnergy() <= 0){
				itr.remove();
			}
		}
		
	}
	
	/**
	 * Essentially resets our board by dereferencing the old one and assigning a new one
	 */
	public static void resetWorld(){
		world = new Critter[Params.world_width][Params.world_height];
		return;
	}
	
	/**
	 * Adds the babies to the list of live Critters
	 */
	public static void birthBabies(){
		for(int i =0; i < crib.size(); i+= 1){
			liveCritters.add(crib.get(i));
		}
		
		crib = new ArrayList<Critter>(0);
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
