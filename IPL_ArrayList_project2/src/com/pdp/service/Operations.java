package com.pdp.service;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.pdp.dao.Dao;
import com.pdp.entity.Player;

public class Operations {

	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // It is use to get a data from console
																						

	static int i = 0; // it is use for find player details

//	It is method for displaying all players of Chhatrapati Sambhajinagar team, with sorting this ways All-rounder, BatsMan and Ballers.
	public static void chhSambhajinagarPlayer() {

		List<Player> arr = Dao.sambhajinagarPlayers();

		System.out.println("\n-------------------------------------------------");
		System.out.println(" | All Chhatrapati Sambhajinagar Team Member Name |");
		System.out.println("-------------------------------------------------");

		System.out.println("\nAll all-rounder : ");
		for (Player player : arr) {

			if (player.getRun() > 5000 && player.getWicket() > 50) {
				System.out.println("        " + player.getName());

			}
		}

		System.out.println("\nAll BatsMan : ");
		for (Player player : arr) {

			if (player.getRun() > 10000 && player.getWicket() < 50) {
				System.out.println("        " + player.getName());
			}
		}

		System.out.println("\nAll Bollors : ");
		for (Player player : arr) {

			if (player.getRun() < 5000 && player.getWicket() > 100) {
				System.out.println("        " + player.getName());
			}
		}
		findChhSambhajinagarPlayerDatails();

	}

	private static void findChhSambhajinagarPlayerDatails() {

		List<Player> arr = Dao.sambhajinagarPlayers();

		int ch = 0;

		do {
			if (i == 0) {
				System.out.println("\nWhich players details do you want : \n enter this player name : ");
				i--;

			}

			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("Plese enter valid name : ");
				e.printStackTrace();
				break;
			}

			int count = 0;
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Invalid name...\nPlease enter currect name from above player name only ");
			}

			System.out.println();
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					i++;
					System.out.println("Another Player Info -->  To Press 1 ");
					System.out.println("Main Menu  --> To press 2 ");

					try {
						ch = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter valid number ");
						e.printStackTrace();
						break;
					}
				}
			}

			switch (ch) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}

			default: {
				if (i == 0) {
					System.out.println("Invalid number... \n Please enter currect choice from menu only ");
				}
				break;
			}
			}
		} while (ch != 2);

	}

//	It is method for displaying all players of MI team, with sorting this ways All-rounder, BatsMan and Ballers.
	public static void miPlayer() {

		List<Player> arr = Dao.miPlayers();

		System.out.println("\n---------------------------");
		System.out.println("| All MI Team Member Name |");
		System.out.println("---------------------------");

		System.out.println("\nAll all-rounder : ");
		for (Player player : arr) {

			if (player.getRun() > 5000 && player.getWicket() > 50) {
				System.out.println("        " + player.getName());

			}
		}

		System.out.println("\nAll BatsMan : ");
		for (Player player : arr) {

			if (player.getRun() > 10000 && player.getWicket() < 50) {
				System.out.println("        " + player.getName());
			}
		}

		System.out.println("\nAll Bollors : ");
		for (Player player : arr) {

			if (player.getRun() < 5000 && player.getWicket() > 100) {
				System.out.println("        " + player.getName());
			}
		}
		findMiPlayerDetails();
	}

//	It is a method for finding a MI player details which players details do you want
	public static void findMiPlayerDetails() {
		List<Player> arr = Dao.miPlayers();

		int ch = 0;

		do {
			if (i == 0) {
				System.out.println("\nWhich players details do you want : \n enter this player name : ");
				i--;

			}

			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("Plese enter valid name : ");
				e.printStackTrace();
				break;
			}

			int count = 0;
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Invalid name...\nPlease enter cureect name from above player name only ");
			}

			System.out.println();
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					i++;
					System.out.println("Another Player Info -->  To Press 1 ");
					System.out.println("Main Menu  --> To press 2 ");

					try {
						ch = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter valid number ");
						e.printStackTrace();
						break;
					}
				}
			}

			switch (ch) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}

			default: {
				if (i == 0) {
					System.out.println("Invalid number... \n Please enter currect choice from menu only ");
				}
				break;
			}
			}
		} while (ch != 2);

	}

//	It is method for displaying all CSK players with sorting All-rounder , BatsMan and Ballers
	public static void cskPlayer() {

		List<Player> arr = Dao.cskPlayers();

		System.out.println("\n---------------------------");
		System.out.println("| All CSK Team Member Name |");
		System.out.println("---------------------------");

		System.out.println("\nAll all-rounder : ");
		for (Player player : arr) {

			if (player.getRun() > 5000 && player.getWicket() > 50) {
				System.out.println("        " + player.getName());

			}
		}

		System.out.println("\nAll BatsMan : ");
		for (Player player : arr) {

			if (player.getRun() > 10000 && player.getWicket() < 50) {
				System.out.println("        " + player.getName());
			}
		}

		System.out.println(" \nAll Bollors : ");
		for (Player player : arr) {

			if (player.getRun() < 5000 && player.getWicket() > 100) {
				System.out.println("        " + player.getName());
			}
		}
		findCskPlayerDetails();
	}

//	It is a method for finding a CSK player details which players details do you want
	public static void findCskPlayerDetails() {

		List<Player> arr = Dao.cskPlayers();

		int ch = 0;

		do {
			if (i == 0) {
				System.out.println("\nWhich players details do you want : \n enter this player name : ");
				i--;

			}

			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("Plese enter valid name : ");
				e.printStackTrace();
				break;
			}

			int count = 0;
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Invalid name...\nPlease enter currect name from above player name only ");
			}

			System.out.println();
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					i++;
					System.out.println("Another Player Info -->  To Press 1 ");
					System.out.println("Main Menu  --> To press 2 ");

					try {
						ch = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter valid number ");
						e.printStackTrace();
						break;
					}
				}
			}

			switch (ch) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}

			default: {
				if (i == 0) {
					System.out.println("Invalid number... \n Please enter currect choice from menu only ");
				}
				break;
			}
			}
		} while (ch != 2);

	}

//	It is method for displaying all RCB players with sorting All-rounder , BatsMan and Ballers
	public static void rcbPlayer() {

		List<Player> arr = Dao.rcbPlayers();

		System.out.println("\n---------------------------");
		System.out.println("| All RCB Team Member Name |");
		System.out.println("---------------------------");

		System.out.println("\nAll rounder : ");
		for (Player player : arr) {

			if (player.getRun() > 5000 && player.getWicket() > 50) {
				System.out.println("        " + player.getName());

			}
		}

		System.out.println("\nAll BatsMan : ");
		for (Player player : arr) {

			if (player.getRun() > 10000 && player.getWicket() < 50) {
				System.out.println("        " + player.getName());
			}
		}

		System.out.println(" \nAll Bollors : ");
		for (Player player : arr) {

			if (player.getRun() < 5000 && player.getWicket() > 100) {
				System.out.println("        " + player.getName());
			}
		}
		findRcbPlayerDetails();
	}

//	It is a method for finding a RCB player details which players details do you want
	public static void findRcbPlayerDetails() {

		List<Player> arr = Dao.rcbPlayers();

		int ch = 0;

		do {
			if (i == 0) {
				System.out.println("\nWhich players details do you want : \n enter this player name : ");
				i--;

			}

			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("Plese enter valid name : ");
				e.printStackTrace();
				break;
			}

			int count = 0;
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					System.out.println(player);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Invalid name...\nPlease enter currect name from above player name only ");
			}

			System.out.println();
			for (Player player : arr) {

				if (player.getName().equalsIgnoreCase(name)) {
					i++;
					System.out.println("Another Player Info -->  To Press 1 ");
					System.out.println("Main Menu  --> To press 2 ");

					try {
						ch = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter valid number ");
						e.printStackTrace();
						break;
					}
				}
			}

			switch (ch) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}

			default: {
				if (i == 0) {
					System.out.println("Invalid number... \n Please enter currect choice from menu only ");
				}
				break;
			}
			}
		} while (ch != 2);

	}

}
