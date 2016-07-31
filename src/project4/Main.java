/* CRITTERS Main.java
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

import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args)  throws InvalidCritterException {
		launch(args);
		/*Scanner se = new Scanner(System.in);
		String s;
		int cnt = 0;

		while (true) {

			s = se.nextLine();
			if (s.equals("show")) {
					Critter.displayWorld();
				
			} else if (s.equals("quit")) {
				System.exit(0);
			} else if (s.contains("step")) {
				if(s.equals("step")){
					Critter.worldTimeStep();
				}
				else {
					try {
						cnt = Integer.parseInt(s.substring(5));
						for (int i = 0; i <= cnt; i++) {
							Critter.worldTimeStep();
						}
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					
					}
					

				}

			} else if (s.contains("stats")) {
				Critter.runStats(CritterWorld.getLiveCritters());
				// sSystem.out.println(Critter.getInstances(s.substring(6)));
			} else if (s.contains("make")) {
				if (s.contains("Craig")) {
					cnt = s.indexOf("Craig") + 6;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Craig");
					}
				}

				else if (s.contains("Lexi")) {
					cnt = s.indexOf("Lexi") + 5;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Lexi");
					}
				} else if (s.contains("Mia")) {
					cnt = s.indexOf("Mia") + 4;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Mia");
					}

				}

				else if (s.contains("Asa")) {
					cnt = s.indexOf("Asa") + 4;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Asa");
					}
				}

				else if (s.contains("Kennedy")) {
					cnt = s.indexOf("Kennedy") + 8;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Kennedy");
					}
				}

				else if (s.contains("Algae")) {
					cnt = s.indexOf("Algae") + 6;
					try {
						cnt = Integer.parseInt(s.substring(cnt));
					} catch (Exception o) {
						System.out.println("Error processing: " + s);
					}
					for (int i = 0; i < cnt; i += 1) {
						Critter.makeCritter("Algae");
					}
				} else {
					System.out.println("Error processing: " + s);
				}

			} else if (s.contains("seed")) {
				try {
					cnt = Integer.parseInt(s.substring(5));
				} catch (Exception o) {
					System.out.println("Error processing: " + s);
				}
				Critter.setSeed(cnt);
			} else {
				System.out.println("Error processing: " + s);
			}

		}*/

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("CritterGUI.fxml"));
		Scene  scene= new Scene(root, 1280, 720);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

}
