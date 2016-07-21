/* CRITTERS Main.java
 * EE422C Project 4 submission by
 * Replace <...> with your actual data.
 * <Student1 Name>
 * <Student1 EID>
 * <Student1 5-digit Unique No.>
 * <Student2 Name>
 * <Student2 EID>
 * <Student2 5-digit Unique No.>
 * Slip days used: <0>
 * Summer 2016
 */
package project4;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidCritterException {
		System.out.println("GLHF");
		Critter.displayWorld();
		Critter.worldTimeStep();
		Critter.runStats(CritterWorld.getLiveCritters());
		for(int i = 0; i <25; i+=1){
			Critter.makeCritter("Craig");
		}
		for(int i = 0; i < 100; i+= 1){
			Critter.makeCritter("Mia");
		}
		for(int i = 0; i < 100; i+= 1){
			Critter.makeCritter("Kennedy");
		}
		for(int i = 0; i < 100; i+= 1){
			Critter.makeCritter("Lexi");
		}
		for(int i = 0; i < 100; i+= 1){
			Critter.makeCritter("Asa");
		}
		for(int i = 0; i < 5; i+= 1){
			Critter.displayWorld();
			Critter.worldTimeStep();
			Critter.runStats(CritterWorld.getLiveCritters());
		}
		
	}
}
