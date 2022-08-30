import java.util.Scanner;

import javax.swing.JFrame;

public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean gameRunning = true;
		int gameCounter = 1;

		String chessBoard[][] = { 
				{ "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8" },
				{ "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7" }, 
				{ "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6" },
				{ "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5" }, 
				{ "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4" },
				{ "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3" }, 
				{ "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2" },
				{ "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1" },

		};
		while (gameRunning) {

			for (int i = 0; i < chessBoard.length; ++i) {

				for (int j = 0; j < chessBoard[i].length; ++j) {
					System.out.print(chessBoard[i][j] + " ");

				}
				System.out.print("\n");
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("what platform do you want to make a move in ?");
			String input = sc.nextLine();

			gameCounter++;

			for (int i = 0; i < chessBoard.length; ++i) {
				for (int j = 0; j < chessBoard[i].length; ++j) {
					if (chessBoard[i][j].contains(input)) {
						if (gameCounter % 2 == 1) {
							chessBoard[i][j] = "X";
						} else {
							chessBoard[i][j] = "O";
						}
					}

				}
			}

		}

	}

}
