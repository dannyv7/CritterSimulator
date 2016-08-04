/* CRITTERS Critter.java
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* see the PDF for descriptions of the methods and fields in this class
 * you may add fields, methods or inner classes to Critter ONLY if you make your additions private
 * no new public, protected or default-package code or data can be added to Critter
 */
public abstract class Critter {
	private boolean hasMoved = false;
	public void setMoved(boolean b){
		hasMoved = b;
	}
	private static java.util.Random rand = new java.util.Random();
	

	public static int getRandomInt(int max) {
		return rand.nextInt(max);
	}

	/**
	 * Sets the x location of the Critter
	 * 
	 * @param x
	 *            x location on 2D plane
	 */
	private void setX(int x) {
		this.x_coord = x;
	}

	/**
	 * Sets the y location of the Critter
	 * 
	 * @param y
	 *            y location on 2D plane
	 */
	private void setY(int y) {
		this.y_coord = y;
	}

	public static void setSeed(long new_seed) {
		rand = new java.util.Random(new_seed);
	}

	/*
	 * a one-character long string that visually depicts your critter in the
	 * ASCII interface
	 */
	public String toString() {
		return "";
	}

	private int energy = Params.start_energy;

	protected int getEnergy() {
		return energy;
	}

	private int x_coord = Math.abs(getRandomInt(Params.world_width)-1);
	private int y_coord = Math.abs(getRandomInt(Params.world_height)-1);

	protected final void walk(int direction) {
		this.energy -= Params.walk_energy_cost;
		if(!this.hasMoved){
			this.newDir(1, direction);
			this.setMoved(true);
		}
		if (this.energy < 0){ this.energy = 0; }
	}

	protected String look(int direction){
		int dist = 1;
		this.energy = this.energy - Params.look_energy_cost;
		Critter[][] displayGrid = CritterWorld.getWorld();
		switch (direction) {
		/* Move directly North */
		case 0:
			if(displayGrid[this.x_coord][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[this.x_coord][wrapY(this.y_coord + dist)].toString();
			}
			
		/* Moves in the Northeast direction */
		case 1:
			if(displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord + dist)].toString();
			}
		/* Moves directly to the East */
		case 2:
			if(displayGrid[wrapX(this.x_coord + dist)][this.y_coord] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][this.y_coord].toString();
			}
		/* Moves in the Southeast direction */
		case 3:
			if(displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves directly to the South */
		case 4:
			if(displayGrid[this.x_coord][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[this.x_coord][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves in the Southwest direction */
		case 5:
			if(displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves directly to the West */
		case 6:
			this.x_coord = wrapX(this.x_coord - dist);
			if(displayGrid[wrapX(this.x_coord - dist)][this.y_coord] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][this.y_coord].toString();
			}
		/* Moves in the Northwest direction */
		case 7:
			if(displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord + dist)].toString();
			}
		}
		
		return null;
	}
	
	protected String look2(int direction){
		int dist = 2;
		this.energy = this.energy - 2 * Params.look_energy_cost;
		Critter[][] displayGrid = CritterWorld.getWorld();
		switch (direction) {
		/* Move directly North */
		case 0:
			if(displayGrid[this.x_coord][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[this.x_coord][wrapY(this.y_coord + dist)].toString();
			}
			
		/* Moves in the Northeast direction */
		case 1:
			if(displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord + dist)].toString();
			}
		/* Moves directly to the East */
		case 2:
			if(displayGrid[wrapX(this.x_coord + dist)][this.y_coord] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][this.y_coord].toString();
			}
		/* Moves in the Southeast direction */
		case 3:
			if(displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord + dist)][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves directly to the South */
		case 4:
			if(displayGrid[this.x_coord][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[this.x_coord][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves in the Southwest direction */
		case 5:
			if(displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord - dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord - dist)].toString();
			}
		/* Moves directly to the West */
		case 6:
			this.x_coord = wrapX(this.x_coord - dist);
			if(displayGrid[wrapX(this.x_coord - dist)][this.y_coord] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][this.y_coord].toString();
			}
		/* Moves in the Northwest direction */
		case 7:
			if(displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord + dist)] == null){
				return null;
			}else{
				return displayGrid[wrapX(this.x_coord - dist)][wrapY(this.y_coord + dist)].toString();
			}
		}
		
		return null;
	}
	
	
	
	protected final void run(int direction) {
		this.energy -= Params.run_energy_cost;
		if(!this.hasMoved){
			this.newDir(2, direction);
			this.setMoved(true);
		}
		if (this.energy < 0){ this.energy = 0; }
	}

	protected final void reproduce(Critter offspring, int direction) {
		this.energy /= 2;
		offspring.energy = this.energy;
		offspring.x_coord = this.x_coord;
		offspring.y_coord = this.y_coord;
		offspring.newDir(1, direction);
		CritterWorld.addToCrib(offspring);
		if (this.energy < 0){ this.energy = 0; }
	}

	public abstract void doTimeStep();

	public abstract boolean fight(String oponent);

	/*
	 * create and initialize a Critter subclass critter_class_name must be the
	 * name of a concrete subclass of Critter, if not an InvalidCritterException
	 * must be thrown
	 */
	public static void makeCritter(String critter_class_name) throws InvalidCritterException {
		if (critter_class_name.equals("Algae")) {
			CritterWorld.addCritter(new Algae());
		} else if (critter_class_name.equals("Craig")) {
			CritterWorld.addCritter(new Craig());
		} else if (critter_class_name.equals("Mia")) {
			CritterWorld.addCritter(new Mia());
		} else if (critter_class_name.equals("Lexi")) {
			CritterWorld.addCritter(new Lexi());
		} else if (critter_class_name.equals("Asa")) {
			CritterWorld.addCritter(new Asa());
		} else if (critter_class_name.equals("Kennedy")) {
			CritterWorld.addCritter(new Kennedy());
		} else {
			throw new InvalidCritterException("No such Critter");
		}
	}

	public static List<Critter> getInstances(String critter_class_name) throws InvalidCritterException {
		List<Critter> result = new java.util.ArrayList<Critter>();
		LinkedList<Critter> check = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = check.iterator();
		Critter next;
		
		while(itr.hasNext()){
			next = itr.next();
			if(next.toString().equals(critter_class_name)){
				result.add(next);
			}
		}
		return result;
	}

	public static void runStats(List<Critter> critters) {
		System.out.print("" + critters.size() + " critters as follows -- ");
		java.util.Map<String, Integer> critter_count = new java.util.HashMap<String, Integer>();
		for (Critter crit : critters) {
			String crit_string = crit.toString();
			Integer old_count = critter_count.get(crit_string);
			if (old_count == null) {
				critter_count.put(crit_string, 1);
			} else {
				critter_count.put(crit_string, old_count.intValue() + 1);
			}
		}
		String prefix = "";
		for (String s : critter_count.keySet()) {
			System.out.print(prefix + s + ":" + critter_count.get(s));
			prefix = ", ";
		}
		System.out.println();
	}

	/*
	 * the TestCritter class allows some critters to "cheat". If you want to
	 * create tests of your Critter model, you can create subclasses of this
	 * class and then use the setter functions contained here.
	 * 
	 * NOTE: you must make sure that the setter functions work with your
	 * implementation of Critter. That means, if you're recording the positions
	 * of your critters using some sort of external grid or some other data
	 * structure in addition to the x_coord and y_coord functions, then you MUST
	 * update these setter functions so that they correctly update your
	 * grid/data structure.
	 */
	static abstract class TestCritter extends Critter {
		protected void setEnergy(int new_energy_value) {
			super.energy = new_energy_value;
		}

		protected void setXCoord(int new_x_coord) {
			super.x_coord = new_x_coord;
		}

		protected void setYCoord(int new_y_coord) {
			super.y_coord = new_y_coord;
		}
	}

	/* Helper methods to move our bugs around */

	/**
	 * Wraps the Critter back on the world when a x directional edge is reached
	 * 
	 * @param x
	 *            New x coord
	 * @return Wrapped x coord or just x if edge is not reacched
	 */
	private static int wrapX(int x) {
		if (x < 0) {
			return Params.world_width - 1;
		} else if (x >= Params.world_width) {
			return 0;
		} else {
			return x;
		}
	}

	/**
	 * Wraps the Critter back on the world when a y directional edge is reached
	 * 
	 * @param y
	 *            New y coord
	 * @return Wrapped y coord or just y if edge is not reached
	 */
	private static int wrapY(int y) {
		if (y < 0) {
			return Params.world_height - 1;
		} else if (y >= Params.world_height) {
			return 0;
		} else {
			return y;
		}
	}

	/**
	 * Sets the new (x, y) for the Critter
	 * 
	 * @param dist
	 *            How far to move (e.g. 1 for walk, 2 for run
	 * @param dir
	 *            The direction to move in
	 */
	private void newDir(int dist, int dir) {
		switch (dir) {
		/* Move directly North */
		case 0:
			this.y_coord = wrapY(this.y_coord + dist);
			break;
		/* Moves in the Northeast direction */
		case 1:
			this.x_coord = wrapX(this.x_coord + dist);
			this.y_coord = wrapY(this.y_coord + dist);
			break;
		/* Moves directly to the East */
		case 2:
			this.x_coord = wrapX(this.x_coord + dist);
			break;
		/* Moves in the Southeast direction */
		case 3:
			this.x_coord = wrapX(this.x_coord + dist);
			this.y_coord = wrapY(this.y_coord - dist);
			break;
		/* Moves directly to the South */
		case 4:
			this.y_coord = wrapY(this.y_coord - dist);
			break;
		/* Moves in the Southwest direction */
		case 5:
			this.x_coord = wrapX(this.x_coord - dist);
			this.y_coord = wrapY(this.y_coord - dist);
			break;
		/* Moves directly to the West */
		case 6:
			this.x_coord = wrapX(this.x_coord - dist);
			break;
		/* Moves in the Northwest direction */
		case 7:
			this.x_coord = wrapX(this.x_coord - dist);
			this.y_coord = wrapY(this.y_coord + dist);
			break;
		}
	}

	private static List<Critter> population = new java.util.ArrayList<Critter>();
	private static List<Critter> babies = new java.util.ArrayList<Critter>();
	
	
	private static void restCosts(){
		LinkedList<Critter> step = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = step.iterator();
		Critter next;

		/* All critters executed their timeStep method */
		while (itr.hasNext()) {
			next = itr.next();
			if(!next.hasMoved){
				next.energy -= Params.rest_energy_cost;
			}
		}
	}

	private static void algaeSpawn() {
		Critter[][] temp = CritterWorld.getWorld();
		int spawnNum;
		spawnNum = Params.refresh_algae_count;
		for (int i = 0; i < spawnNum; i++) {
			try {
				makeCritter("Algae");
			} catch (InvalidCritterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			temp[CritterWorld.getLiveCritters().get(CritterWorld.getLiveCritters().size() - 1).x_coord][CritterWorld.getLiveCritters().get(CritterWorld.getLiveCritters().size() - 1).y_coord] = new Algae();
		}

	}

	public static void worldTimeStep() {
		LinkedList<Critter> step = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = step.iterator();
		Critter next;

		/* All critters executed their timeStep method */
		while (itr.hasNext()) {
			next = itr.next();
			next.doTimeStep();
		}
		//CritterWorld.removeDeadCritters();
		placeCritters();
		algaeSpawn();
		restCosts();
		CritterWorld.removeDeadCritters();
		CritterWorld.birthBabies();

	}

	/**
	 * Places critters onto the coordinate plane for displaying
	 */

	private static void placeCritters() {
		int x = 0;
		int y = 0;
		ArrayList<Critter> temp = new ArrayList<Critter>(0);
		LinkedList<Critter> step = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = step.iterator();
		Critter next;

		/* All critters executed their timeStep method */
		while (itr.hasNext()) {
			next = itr.next();
			temp.add(next);
		}
		
		/* Resets our frame */
		CritterWorld.resetWorld();
		Critter[][] displayGrid = CritterWorld.getWorld();
		for (int i = 0; i < temp.size(); i += 1) {
			if(temp.get(i).energy <= 0){}
			/* Conflict resolution */
			else if (displayGrid[temp.get(i).x_coord][temp.get(i).y_coord] != null) {
				/* Who cares if Algae spawns where it wants ??*/
				if(temp.get(i) instanceof Algae){
					return;
				}
				/* Bookkeeping stuff */
				Critter originalCritter = displayGrid[temp.get(i).x_coord][temp.get(i).y_coord];
				Critter newCritter = temp.get(i);
				int originalRoll;
				int newRoll;
				/* Determine whether the original inhabitant wants to fight or not */
				if(originalCritter instanceof Algae){originalRoll = 0; }
				else if (originalCritter.fight(newCritter.toString())) {
					if(originalCritter.energy <= 0){ originalRoll = 0;}
					else{
						originalRoll = getRandomInt(originalCritter.energy);
					}
				} else {
					originalRoll = 0;
					x = originalCritter.x_coord;
					y = originalCritter.y_coord;
					/* Find an appropriate escape destination */
					while (displayGrid[originalCritter.x_coord][originalCritter.y_coord] != null) {
						originalCritter.x_coord = x;
						originalCritter.y_coord = y;
						/* If already moved, penalize it for moving and it remains */
						if(originalCritter.hasMoved){ originalCritter.energy-=2; if (originalCritter.energy < 0){ originalCritter.energy = 0; }break;}
						originalCritter.run(getRandomInt(7));
					}

				}

				/* Determines whether the invader will fight */
				if (newCritter.fight(originalCritter.toString())) {
					if(newCritter.energy <= 0){ newRoll = 0;}
					else{
						newRoll = getRandomInt(newCritter.energy);
					}
				} else {
					newRoll = 0;
					x = newCritter.x_coord;
					y = newCritter.y_coord;
					/* Find an appropriate escape location */
					while (displayGrid[newCritter.x_coord][newCritter.y_coord] != null) {
						newCritter.x_coord = x;
						newCritter.y_coord = y;
						/* If already moved, penalize it and it stays */
						if(newCritter.hasMoved){ newCritter.energy-=2; if (newCritter.energy < 0){ newCritter.energy = 0; } break;}
						newCritter.run(getRandomInt(7));
					}
				}

				/* Determine the winner if they are still occcupying the same spot */
				if(originalCritter.x_coord == newCritter.x_coord && originalCritter.y_coord == newCritter.y_coord){
					/* Original inhabitant is the winner */
					if (originalRoll >= newRoll && ! (originalCritter instanceof Algae)) {
						originalCritter.energy += newCritter.energy / 2;
						newCritter.energy = 0;
						displayGrid[originalCritter.x_coord][originalCritter.y_coord] = originalCritter;
					/* Invader wins */
					}else if(newRoll > originalRoll || (originalCritter instanceof Algae)){
						newCritter.energy += originalCritter.energy / 2;
						originalCritter.energy = 0;
						displayGrid[newCritter.x_coord][newCritter.y_coord] = newCritter;
					}
				}
			} else {	//Empty slot, just place the Critter
				displayGrid[temp.get(i).x_coord][temp.get(i).y_coord] = temp.get(i);
			}
		}

	}
	
	private static void placeCrittersPacifist(){
		int x = 0;
		int y = 0;
		ArrayList<Critter> temp = new ArrayList<Critter>(0);
		LinkedList<Critter> step = CritterWorld.getLiveCritters();
		Iterator<Critter> itr = step.iterator();
		Critter next;

		/* All critters executed their timeStep method */
		while (itr.hasNext()) {
			next = itr.next();
			temp.add(next);
		}
		
		/* Resets our frame */
		CritterWorld.resetWorld();
		Critter[][] displayGrid = CritterWorld.getWorld();
		for (int i = 0; i < temp.size(); i += 1) {
			if(temp.get(i).energy <= 0){}
			else {	//Empty slot, just place the Critter
				if(temp.get(i) instanceof Algae){
					if(displayGrid[temp.get(i).x_coord][temp.get(i).y_coord] == null){
						displayGrid[temp.get(i).x_coord][temp.get(i).y_coord] = temp.get(i);
					}
				}else{
					displayGrid[temp.get(i).x_coord][temp.get(i).y_coord] = temp.get(i);
				}
			}
		}
	}

	/**
	 * Prints the border and the critter
	 */
	public static void displayWorld() {
		placeCrittersPacifist();
		/* Creates the top border */
		System.out.print("|");
		for(int i = 0; i < Params.world_width; i += 1){
			System.out.print("-");
		}
		System.out.println("|");
		
		/* Prints the critters/empty slots */
		for(int i = 0; i < Params.world_height; i += 1){
			System.out.print("|");
			
			for(int k = 0; k < Params.world_width; k += 1){
				if(CritterWorld.getWorld()[k][i] == null){
					System.out.print(" ");
				}else{
					System.out.print(CritterWorld.getWorld()[k][i]);
				}
			}
			
			System.out.println("|");
		}
		
		/* Creates the bottom border */
		System.out.print("|");
		for(int i = 0; i < Params.world_width; i += 1){
			System.out.print("-");
		}
		System.out.println("|");

	}
}
