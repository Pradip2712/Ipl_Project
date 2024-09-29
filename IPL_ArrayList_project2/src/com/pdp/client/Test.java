package com.pdp.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.pdp.controller.TeamController;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("-------------- * IPL Project * --------------");

		int choice = 0;
		do {

			System.out.println("1. Chhatrapati Sambhajinagar");
			System.out.println("2. MI ");
			System.out.println("3. CSK ");
			System.out.println("4. RCB ");
			System.out.println("5. Exit... ");

			System.out.println("Please the num which team you want : ");
			do {
				try {
					choice = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter integer number : ");
//					e.printStackTrace();
					break;
				}

				switch (choice) {
				case 1: {
					TeamController.getAllPlayersOfSambhajinagar();
					break;
				}
				case 2: {
					TeamController.getAllPlayersOfMi();
					break;
				}
				case 3: {
					TeamController.getAllPlayersOfCsk();
					break;

				}
				case 4: {
					TeamController.getAllPlayersOfRcb();
					break;
				}
				case 5: {
					System.out.println("Thank you for use our application \nPlease Visit Again...");
					break;
				}
				default: {
					System.out.println("please enter valid number : \n Choice must be from menu only :- ");
				}
				}
			} while (choice > 5 || choice <= 0);
		} while (choice != 5);
	}

}
