package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double startAmount = 2;
		double winChance = 0.7;
		double winLimit = 10;
		int totalSimulations = 10;
		int day = 1;
		int count = 0;
		
		while (day <= totalSimulations) {
			while (winLimit > startAmount && startAmount != 0) {
			if (Math.random() <= winChance) {
				startAmount++;
				count++;
			} else {
				startAmount--;
				count++;
			}
		}
		if (winLimit == startAmount) {
			System.out.println("Simulation " + day + ": " + count + " WIN");
			day++;
			startAmount = 2;
		} else {
			System.out.println("Simulation " + day + ": " + count + " LOSE");
			day++;
			startAmount = 2;
		}
		
		}
	}

}
