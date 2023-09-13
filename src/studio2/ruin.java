package studio2;

import java.util.Scanner;

public class ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you have to start gambling?");
		double startAmount = in.nextDouble();
		System.out.println("What is the probability that you win a single play?");
		double winChance = in.nextDouble();
		System.out.println("If you reach this amount of money you had a successful day and leave");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to simulate?");
		int totalSimulations = in.nextInt();
		int simNumber = 0;
		int numLosses = 0;
		int numWins = 0;
		double a = (1.0 - winChance) / winChance;
		
		//if (winChance == 50) {
			
		//}
		
		for(int i = 1; i <= totalSimulations; i++) {
			while(startAmount > 0 && startAmount < winLimit) {
				simNumber++;
				double randNum = 100 * Math.random();
				randNum = Math.round(randNum);
					if (randNum <= winChance) {
						System.out.println("Simulation " + simNumber + ": WIN" );
						startAmount++;
						numWins++;
					} else {
							System.out.println("Simulation " + simNumber + ": LOSE");
							startAmount--;
							numLosses++;
					}	
		}
			if (numWins > numLosses) {
				System.out.println("This simulation ended in a success");
			} else {
				System.out.println("This simulation ended in ruin");
			}
		//lets say win chance .25, 
		}
		System.out.println("Losses: " + numLosses + " Wins: " + numWins + " Simulations: " + simNumber);
		}
	}
// 65
// 4