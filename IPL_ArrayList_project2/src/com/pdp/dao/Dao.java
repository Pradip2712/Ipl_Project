package com.pdp.dao;

import java.util.ArrayList;
import java.util.List;

import com.pdp.entity.Player;

public class Dao {

	static List<Player> la = null;

	public static List<Player> sambhajinagarPlayers() {
		la = new ArrayList<Player>();

		la.add(new Player("Pradip Pawar", 89, "Chhatrapati Sambhajinagar", 257, 22528, 40)); // BatMan
		la.add(new Player("Sid Jadhav", 41, "Chhatrapati Sambhajinagar", 137, 9525, 76)); // All-rounder
		la.add(new Player("Pappu Rahekar", 91, "Chhatrapati Sambhajinagar", 133, 9504, 95)); // Baller
		la.add(new Player("Shiv Girnare", 35, "Chhatrapati Sambhajinagar", 100, 4000, 102)); // Baller
		la.add(new Player("Kaushal Kathar", 27, "Chhatrapati Sambhajinagar", 257, 12528, 40)); // BatMan
		la.add(new Player("Dnyaneshwar Pimple", 90, "Chhatrapati Sambhajinagar", 137, 9525, 76));// All-rounder
		la.add(new Player("Sagar Jadhav", 39, "Chhatrapati Sambhajinagar", 133, 3504, 140)); // Baller
		la.add(new Player("Kedar Gawali", 26, "Chhatrapati Sambhajinagar", 133, 3504, 150)); // Baller
		la.add(new Player("Varun Patil", 88, "Chhatrapati Sambhajinagar", 100, 2000, 109)); // Baller
		la.add(new Player("Sham Patil", 86, "Chhatrapati Sambhajinagar", 257, 15528, 45)); // BatMan
		la.add(new Player("Omraj Chaudhary", 4, "Chhatrapati Sambhajinagar", 137, 8800, 90));// All-rounder
		la.add(new Player("Jagdish Zalte", 136, "Chhatrapati Sambhajinagar", 133, 3204, 120)); // Baller
		la.add(new Player("Atul Bhingare", 10, "Chhatrapati Sambhajinagar", 100, 9090, 92)); // Baller
		la.add(new Player("Kiran Sonwane", 98, "Chhatrapati Sambhajinagar", 257, 16528, 40)); // BatMan
		la.add(new Player("Sanket Khose", 36, "Chhatrapati Sambhajinagar", 137, 9525, 76));// All-rounder

		return la;

	}

	public static List<Player> miPlayers() {
		la = new ArrayList<Player>();

		la.add(new Player("Rohit Sharma", 45, "MI", 257, 22528, 40)); // BatMan
		la.add(new Player("Hardik Pandya", 33, "MI", 137, 9525, 76)); // All-rounder
		la.add(new Player("Jasprit Bumrah", 69, "MI", 133, 3504, 165)); // Baller
		la.add(new Player("Piyush Chawla", 5, "MI", 100, 2000, 102)); // Baller
		la.add(new Player("Ishan Kishan", 32, "MI", 150, 11000, 25)); // BatsMan
		la.add(new Player("Suryakumar Yadav", 63, "MI", 150, 14094, 30));// BatsMan
		la.add(new Player("Lakshid Malinga", 27, "MI", 25, 1022, 128)); // Baller
		la.add(new Player("Kieran Polad", 24, "MI", 4, 7000, 60)); // All-rounder
		la.add(new Player("Roman Shaferd", 23, "MI", 12, 8041, 74)); // All-rounder
		la.add(new Player("Nuwan phushjar", 23, "MI", 12, 1251, 124)); // Baller
		la.add(new Player("Tilak Varma", 21, "MI", 25, 11740, 33)); // BatsMan
		la.add(new Player("Cameron Green", 24, "MI", 16, 8452, 60)); // All-rounder
		la.add(new Player("Tim David", 27, "MI", 25, 14622, 28)); // BatsMan
		la.add(new Player("Arjun Tendulkar", 24, "MI", 4, 1253, 130)); // Baller
		la.add(new Player("Nehal Wadhera", 23, "MI", 12, 12241, 24)); // BatsMan

		return la;

	}

	public static List<Player> cskPlayers() {
		la = new ArrayList<Player>();

		la.add(new Player("Ruturaj Gaikwad", 12, "CSK", 66, 16000, 30)); // BatsMan
		la.add(new Player("MS Dhoni", 7, "CSK", 264, 19094, 45)); // BatsMan
		la.add(new Player("Ravindra Jadeja ", 8, "CSK", 240, 8525, 60));// All-Rounder
		la.add(new Player("Shivam Dube", 4, "CSK", 65, 6504, 55)); // All-rounder
		la.add(new Player("Deepak Chahar", 5, "CSK", 81, 2000, 122)); // Baller
		la.add(new Player("Tushar Deshpande", 6, "CSK", 150, 1200, 101));// Baller

		la.add(new Player("Devon Conway", 32, "CSK", 23, 12888, 38)); // BatsMan
		la.add(new Player("Moeen Ali", 36, "CSK", 55, 7200, 54)); // All-rounder
		la.add(new Player("Ambati Rayudu", 38, "CSK", 204, 14329, 30)); // BatsMan
		la.add(new Player("Tushar Deshpande", 29, "CSK", 17, 3616, 133)); // Baller
		la.add(new Player("Matheesha Pathirana", 21, "CSK", 12, 1517, 119));// Baller
		la.add(new Player("Ajinkya Rahane", 35, "CSK", 158, 14233, 25)); // BatsMan
		la.add(new Player("Ben Stokes", 33, "CSK", 45, 11920, 72)); // All-rounder

		return la;
	}

	public static List<Player> rcbPlayers() {
		la = new ArrayList<Player>();

		la.add(new Player("Virat Kohli", 18, "RCB", 252, 20001, 45)); // BatsMan
		la.add(new Player("Faf du Plessis", 2, "RCB", 145, 17094, 35)); // BatsMan
		la.add(new Player("Glenn Maxwell", 42, "RCB", 134, 6525, 65)); // All-rounder
		la.add(new Player("Mahipal Lomror", 4, "RCB", 65, 5404, 55)); // All-rounder
		la.add(new Player("Akash Deep", 5, "RCB", 81, 2000, 102)); // Baller
		la.add(new Player("Mohammed Siraj", 73, "RCB", 150, 1900, 151)); // Baller

		la.add(new Player("Dinesh Karthik", 39, "RCB", 242, 14501, 29)); // BatsMan
		la.add(new Player("Wanindu Hasaranga", 27, "RCB", 26, 7150, 52)); // All-rounder
		la.add(new Player("Harshal Patel", 33, "RCB", 83, 2248, 128)); // Baller
		la.add(new Player("Josh Hazlewood", 33, "RCB", 24, 1232, 122)); // Baller
		la.add(new Player("Shahbaz Ahmed", 29, "RCB", 31, 7279, 64)); // All-rounder
		la.add(new Player("Karn Sharma", 36, "RCB", 69, 1561, 125)); // Baller
		la.add(new Player("David Willey", 34, "RCB", 6, 1329, 130)); // Baller

		return la;
	}

}
