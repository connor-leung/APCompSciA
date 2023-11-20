package ArraysNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleShip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean player1 = true;
		boolean player2 = false;
		int x = 0;
		int y = 0;
		int xfire = 0;
		int yfire = 0;
		int direction = 0;
		int shipSize = 0;
		int shipName = 0;
		int p1counter = 0;
		int p2counter = 0;
		boolean right = false;
		boolean left = false;
		boolean up = false;
		boolean down = false;
		boolean game = true;
		ArrayList<String> p1ships = new ArrayList<String>(5);
		String[][] p1Grid = new String[10][10];
		int[][] p1Hidden = new int[10][10];
		ArrayList<String> p2ships = new ArrayList<String>(5);
		String[][] p2Grid = new String[10][10];
		int[][] p2Hidden = new int[10][10];
		
		p1ships.add(0, "Carrier (5)");
		p1ships.add(1, "Battleship (4)");
		p1ships.add(2, "Cruiser (3)");
		p1ships.add(3, "Submarine (2)");
		p1ships.add(4, "Destroyer (1)");
		
		p2ships.add(0, "Carrier (5)");
		p2ships.add(1, "Battleship (4)");
		p2ships.add(2, "Cruiser (3)");
		p2ships.add(3, "Submarine (2)");
		p2ships.add(4, "Destroyer (1)");
		
		System.out.println("**Note grid numbers go from 0-9**");
	
		for (int i = 0; i < p1Grid.length; i++) {
			for (int j = 0; j < p1Grid[0].length; j++) {
				p1Grid[i][j] = "+";
			}
		}
		
		for (int i = 0; i < p2Grid.length; i++) {
			for (int j = 0; j < p2Grid[0].length; j++) {
				p2Grid[i][j] = "+";
			}
		}
		
		System.out.println("Player 1");
		
		while (p1ships.size() > 0) {
			
			System.out.println("Which ship do you want to place?");
			
			for (int i = 0; i < p1ships.size(); i++) {
				System.out.println(p1ships.get(i));
			}
			
			System.out.println("Pick a ship by typing the number beside it  **please put in right number**");
			shipName = scan.nextInt();
			
			while (shipName < 1 || shipName > 5) {
				System.out.println("Invalid Input");
				System.out.println("Pick a ship by typing the number beside it");
				shipName = scan.nextInt();
			}
			
			for (int i = 0; i < p1ships.size(); i++) {
				if (p1ships.get(i).equals("Carrier (5)") && shipName == 5) {
					p1ships.remove(i);
					shipSize = 5;
				} 
				else if (p1ships.get(i).equals("Battleship (4)") && shipName == 4) {
					p1ships.remove(i);
					shipSize = 4;
				} 
				else if (p1ships.get(i).equals("Cruiser (3)") && shipName == 3) {
					p1ships.remove(i);
					shipSize = 3;
				} 
				else if (p1ships.get(i).equals("Submarine (2)") && shipName == 2) {
					p1ships.remove(i);
					shipSize = 3;
				} 
				else if (p1ships.get(i).equals("Destroyer (1)") && shipName == 1) {
					p1ships.remove(i);
					shipSize = 2;
				} 
			}
			
			//Ships
			System.out.println("x-axis starting point");
			x = scan.nextInt();
			System.out.println("y-axis starting point");
			y = scan.nextInt();
			System.out.println("Which way do you want it to go? (1)LEFT, (2)RIGHT, (3)UP, (4)DOWN **please put right number**");
			direction = scan.nextInt();
			
			while (x < 0 || y < 0) {
				System.out.println("Invalid Input");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				System.out.println("Which way do you want it to go? (1)LEFT, (2)RIGHT, (3)UP, (4)DOWN **please put right number**");
				direction = scan.nextInt();
			}
			
			//left
			if (direction == 1 && x - shipSize + 1 >= 0) {
				for (int i = x; i > x - shipSize; i--) {
					if (p1Hidden[y][i] > 0) left = true;
				}
			}
			//right
			if (direction == 2 && x + shipSize - 1 < 10) {
				for (int i = x; i < x + shipSize; i++) {
					if (p1Hidden[y][i] > 0)right = true;
				}
			}
			//up 
			if (direction == 3 && y - shipSize + 1 >= 0) {
				for (int i = y; i > y - shipSize; i--) {
					if (p1Hidden[i][x] > 0)up = true;
				}
			}
			//down
			if (direction == 4 && y + shipSize - 1 < 10) {
				for (int i = y; i < y + shipSize; i++) {
					if (p1Hidden[i][x] > 0)down = true;
				}
			}
			
			//out of bounds in x direction and left
			while ((x - shipSize + 1 < 0 && direction == 1)|| left) {
				System.out.println("Invalid Placement (going left)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (x - shipSize + 1 >= 0) {
					for (int i = x; i > x - shipSize; i--) {
						if (p1Hidden[y][i] > 0) left = true;
						else left = false;
					}
				}
			}
			//out of bounds in x direction right
			while ((x + shipSize > 10 && direction == 2) || right) {
				System.out.println("Invalid Placement (going right)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (x + shipSize - 1 < 10) {
					for (int i = x; i < x + shipSize; i++) {
						if (p1Hidden[y][i] > 0) right = true;
						else right = false;
					}
				}
			}
			//out of bounds in y direction up
			while ((y - shipSize + 1 < 0 && direction == 3) || up) {
				System.out.println("Invalid Placement (going up)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (y - shipSize + 1 >= 0) {
					for (int i = y; i > y - shipSize; i--) {
						if (p1Hidden[i][x] > 0) up = true;
						else up = false;
					}
				}
			}
			//out of bounds in y direction down
			while ((direction == 4 && y + shipSize > 10) || down) {
				System.out.println("Invalid Placement (going down)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (y + shipSize - 1 < 10) {
					for (int i = y; i < y + shipSize; i++) {
						if (p1Hidden[i][x] > 0) down = true;
						else down = false;
					}
				}
			}
			
			right = false;
			left = false;
			up = false;
			down = false;
			
			//left
			
			if (direction == 1) {
				for (int i = x; i > x - shipSize; i--) {
				p1Hidden[y][i] = shipSize;
				}
			}
			//Right
			if (direction == 2) {
				for (int i = x; i < x + shipSize; i++) {
					p1Hidden[y][i] = shipSize;
				}
			}
			
			
			//Down
			if (direction == 4) {
				for (int i = y; i < y + shipSize; i++) {
					p1Hidden[i][x] = shipSize;
				}
			}
			
			//Up
			if (direction == 3) {
				for (int i = y; i > y - shipSize; i--) {
					p1Hidden[i][x] = shipSize;
				}
			}
			
			//show hidden board
			for (int i = 0; i < p1Hidden.length; i++) {
				for (int j = 0; j < p1Hidden[0].length; j++) {
					System.out.print(p1Hidden[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		System.out.println("Player 2");
		
		while (p2ships.size() > 0) {
			
			System.out.println("Which ship do you want to place?");
			
			for (int i = 0; i < p2ships.size(); i++) {
				System.out.println(p2ships.get(i));
			}
			
			System.out.println("Pick a ship by typing the number beside it  **please put in right number**");
			shipName = scan.nextInt();
			
			while (shipName < 1 || shipName > 5) {
				System.out.println("Invalid Input");
				System.out.println("Pick a ship by typing the number beside it");
				shipName = scan.nextInt();
			}
			
			for (int i = 0; i < p2ships.size(); i++) {
				if (p2ships.get(i).equals("Carrier (5)") && shipName == 5) {
					p2ships.remove(i);
					shipSize = 5;
				} 
				else if (p2ships.get(i).equals("Battleship (4)") && shipName == 4) {
					p2ships.remove(i);
					shipSize = 4;
				} 
				else if (p2ships.get(i).equals("Cruiser (3)") && shipName == 3) {
					p2ships.remove(i);
					shipSize = 3;
				} 
				else if (p2ships.get(i).equals("Submarine (2)") && shipName == 2) {
					p2ships.remove(i);
					shipSize = 3;
				} 
				else if (p2ships.get(i).equals("Destroyer (1)") && shipName == 1) {
					p2ships.remove(i);
					shipSize = 2;
				} 
			}
			
			//Ships
			System.out.println("x-axis starting point");
			x = scan.nextInt();
			System.out.println("y-axis starting point");
			y = scan.nextInt();
			System.out.println("Which way do you want it to go? (1)LEFT, (2)RIGHT, (3)UP, (4)DOWN **please put right number**");
			direction = scan.nextInt();
			
			while (x < 0 || y < 0) {
				System.out.println("Invalid Input");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				System.out.println("Which way do you want it to go? (1)LEFT, (2)RIGHT, (3)UP, (4)DOWN **please put right number**");
				direction = scan.nextInt();
			}
			
			//left
			if (direction == 1 && x - shipSize + 1 >= 0) {
				for (int i = x; i > x - shipSize; i--) {
					if (p2Hidden[y][i] > 0) left = true;
				}
			}
			//right
			if (direction == 2 && x + shipSize - 1 < 10) {
				for (int i = x; i < x + shipSize; i++) {
					if (p2Hidden[y][i] > 0)right = true;
				}
			}
			//up 
			if (direction == 3 && y - shipSize + 1 >= 0) {
				for (int i = y; i > y - shipSize; i--) {
					if (p2Hidden[i][x] > 0)up = true;
				}
			}
			//down
			if (direction == 4 && y + shipSize - 1 < 10) {
				for (int i = y; i < y + shipSize; i++) {
					if (p2Hidden[i][x] > 0)down = true;
				}
			}
			
			//out of bounds in x direction and left
			while ((x - shipSize + 1 < 0 && direction == 1)|| left) {
				System.out.println("Invalid Placement (going left)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (x - shipSize + 1 >= 0) {
					for (int i = x; i > x - shipSize; i--) {
						if (p2Hidden[y][i] > 0) left = true;
						else left = false;
					}
				}
			}
			//out of bounds in x direction right
			while ((x + shipSize > 10 && direction == 2) || right) {
				System.out.println("Invalid Placement (going right)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (x + shipSize - 1 < 10) {
					for (int i = x; i < x + shipSize; i++) {
						if (p2Hidden[y][i] > 0) right = true;
						else right = false;
					}
				}
			}
			//out of bounds in y direction up
			while ((y - shipSize + 1 < 0 && direction == 3) || up) {
				System.out.println("Invalid Placement (going up)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (y - shipSize + 1 >= 0) {
					for (int i = y; i > y - shipSize; i--) {
						if (p2Hidden[i][x] > 0) up = true;
						else up = false;
					}
				}
			}
			//out of bounds in y direction down
			while ((direction == 4 && y + shipSize > 10) || down) {
				System.out.println("Invalid Placement (going down)");
				System.out.println("x-axis starting point");
				x = scan.nextInt();
				System.out.println("y-axis starting point");
				y = scan.nextInt();
				if (y + shipSize - 1 < 10) {
					for (int i = y; i < y + shipSize; i++) {
						if (p2Hidden[i][x] > 0) down = true;
						else down = false;
					}
				}
			}
			
			right = false;
			left = false;
			up = false;
			down = false;
			
			//left
			
			if (direction == 1) {
				for (int i = x; i > x - shipSize; i--) {
					p2Hidden[y][i] = shipSize;
				}
			}
			//Right
			if (direction == 2) {
				for (int i = x; i < x + shipSize; i++) {
					p2Hidden[y][i] = shipSize;
				}
			}
			
			
			//Down
			if (direction == 4) {
				for (int i = y; i < y + shipSize; i++) {
					p2Hidden[i][x] = shipSize;
				}
			}
			
			//Up
			if (direction == 3) {
				for (int i = y; i > y - shipSize; i--) {
					p2Hidden[i][x] = shipSize;
				}
			}
			
			//show hidden board
			for (int i = 0; i < p2Hidden.length; i++) {
				for (int j = 0; j < p2Hidden[0].length; j++) {
					System.out.print(p2Hidden[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		
		
		while (game) {
			while (player1) {
				System.out.println("Player 1");
				
				System.out.println("Where do you want to fire?");
				System.out.println("x-coordinate:");
				xfire = scan.nextInt();
				System.out.println("y-coordinate:");
				yfire = scan.nextInt();
				
				while (xfire < 0 || xfire > 10 || yfire > 10 || yfire < 0) {
					System.out.println("Value exceeds bounds");
					System.out.println("x-coordinate:");
					xfire = scan.nextInt();
					System.out.println("y-coordinate:");
					yfire = scan.nextInt();
				}
				
				while(p1Grid[xfire][yfire].equals("x") || p1Grid[xfire][yfire].equals("o")) {
					System.out.println("You already hit that location");
					System.out.println("x-coordinate:");
					xfire = scan.nextInt();
					System.out.println("y-coordinate:");
					yfire = scan.nextInt();
				}
				
				if (p2Hidden[yfire][xfire] > 0) {
					System.out.println("Hit");
					p1Grid[yfire][xfire] = "x";
				}
				else {
					System.out.println("Miss");
					p1Grid[yfire][xfire] = "o";
					player1 = false;
					player2 = true;
				}
				
				p1counter = 0;
				
				for (int i = 0; i < p1Grid.length; i++) {
					for (int j = 0; j < p1Grid[0].length; j++) {
						if (p1Grid[i][j].equals("x")) {
							p1counter++;
						}
					}
				}
				
				if (p1counter == 17) {
					System.out.println("Player 1 wins");
					player1 = false;
					game = false;
					break;
				}
				
				//Printing board
				for (int i = 0; i < p1Grid.length; i++) {
					for (int j = 0; j < p1Grid[0].length; j++) {
						System.out.print(p1Grid[i][j] + " ");
					}
					System.out.println();
				}
				
			}
			
			while (player2) {
				System.out.println("Player 2");
				
				System.out.println("Where do you want to fire?");
				System.out.println("x-coordinate:");
				xfire = scan.nextInt();
				System.out.println("y-coordinate:");
				yfire = scan.nextInt();
				
				while (xfire < 0 || xfire > 10 || yfire > 10 || yfire < 0) {
					System.out.println("Value exceeds bounds");
					System.out.println("x-coordinate:");
					xfire = scan.nextInt();
					System.out.println("y-coordinate:");
					yfire = scan.nextInt();
				}
				
				while(p2Grid[xfire][yfire].equals("x") || p2Grid[xfire][yfire].equals("o")) {
					System.out.println("You already hit that location");
					System.out.println("x-coordinate:");
					xfire = scan.nextInt();
					System.out.println("y-coordinate:");
					yfire = scan.nextInt();
				}
				
				if (p1Hidden[yfire][xfire] > 0) {
					System.out.println("Hit");
					p2Grid[yfire][xfire] = "x";
				}
				else {
					System.out.println("Miss");
					p2Grid[yfire][xfire] = "o";
					player2 = false;
					player1 = true;
				}
				
				p2counter = 0;
				
				for (int i = 0; i < p2Grid.length; i++) {
					for (int j = 0; j < p2Grid[0].length; j++) {
						if (p2Grid[i][j].equals("x")) {
							p2counter++;
						}
					}
				}
				
				if (p2counter == 17) {
					System.out.println("Player 2 wins");
					player2 = false;
					game = false;
					break;
				}
				
				//Printing board
				for (int i = 0; i < p2Grid.length; i++) {
					for (int j = 0; j < p2Grid[0].length; j++) {
						System.out.print(p2Grid[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
		
		
		
		
		
	}

}
