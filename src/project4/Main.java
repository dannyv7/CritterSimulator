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
		Scanner se = new Scanner(System.in);
		String s;
		int cnt = 0;
		
		while(true){
			
			s = se.nextLine();
            if(s.equals("show")) {
            	Critter.displayWorld();
            } else if(s.equals("quit")) {
                System.exit(0);
            } else if(s.contains("step")) {
            	if(s.length() > 4){
            	cnt = Integer.parseInt(s.substring(5));
            	for(int i = 0; i <= cnt; i++){
            		Critter.worldTimeStep();
            	}
            	}else{
            		Critter.worldTimeStep();
            	}
            	
            } else if(s.contains("stats")){
            	//System.out.println(s.substring(6));
            	Critter.runStats(CritterWorld.getLiveCritters());
            	//System.out.println(Critter.getInstances(s.substring(6)));
            } else if(s.contains("make")){
            	if(s.contains("Craig")){
            		cnt = s.indexOf("Craig")+6;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Craig");
            		}
            	}
            	
            	if(s.contains("Lexi")){
            		cnt = s.indexOf("Lexi")+5;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Lexi");
            		}
            	}
            	if(s.contains("Mia")){
            		cnt = s.indexOf("Mia")+4;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Mia");
            		}
            		
            	}
            	
            	if(s.contains("Asa")){
            		cnt = s.indexOf("Asa")+4;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Asa");
            		}
            	}
            	
            	
            	if(s.contains("Kennedy")){
            		cnt = s.indexOf("Kennedy")+8;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Kennedy");
            		}
            	}
            	
            	if(s.contains("Algae")){
            		cnt = s.indexOf("Algae")+6;
            		cnt = Integer.parseInt(s.substring(cnt));
            		for(int i = 0; i <= cnt; i+=1){
            			Critter.makeCritter("Algae");
            		}
            }
            
        
	}		else if(s.contains("seed")){
			cnt = Integer.parseInt(s.substring(5));
			Critter.setSeed(cnt);
	}
            
	}
		/*System.out.println("GLHF");
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
		for(int i = 0; i < 15; i+= 1){
			Critter.displayWorld();
			Critter.worldTimeStep();
			Critter.runStats(CritterWorld.getLiveCritters());
		}
		
	}st*/
}
}
