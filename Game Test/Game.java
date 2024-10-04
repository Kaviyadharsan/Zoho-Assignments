package arrays;


//Starting Time :11:20
//Ending Time :12:40

import java.util.Scanner;

public class Game{
	
	
	private static char[][]board= {
			{'_','_','_'},
			{'_','_','_'},
			{'_','_','_'},
			
		};
	
	private static char currentPlayer='X';
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean gameOngoing=true;
		
		printBoard();
		
		while(gameOngoing) {
		int row,col;
		
		//Using To Store The Move
		System.out.println("Player "+ (currentPlayer=='X'?"1(X)":"2(O)")+ ",Enter Your Move(row and column):");
		row=scanner.nextInt();
		col=scanner.nextInt();
		
		
		
        
        // Check if the move is valid
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer;
            printBoard();
            
            // Check if there's a winner or draw
            if (checkWinner()) {
                System.out.println("Congratulations, Player " + (currentPlayer == 'X' ? "1 (X)" : "2 (O)") + " wins!");
                gameOngoing = false;
                
            } 
            else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameOngoing = false;
            } 
            else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        } 
        else {
            System.out.println("Invalid move or Position Alreday Filled.Please try again.");
            System.out.println();
        }
        
		}
    }
	
   //Method For Print The Current Move
		 private static void printBoard() {
		        for (char[] row : board) {
		            for (char cell : row) {
		                System.out.print(cell + " ");
		            }
		            System.out.println();
		        }
		        }
		 //Method For The Move Is Valid
		    
		        private static boolean isValidMove(int row, int col) {
		            if (row < 0 || row > 2 || col < 0 || col > 2) {
		                return false;
		            }
		            return board[row][col] == '_';
		        
		
		}
		     //Method For Check  a winner
		        private static boolean checkWinner() {
		            // Check rows and columns
		            for (int i = 0; i < 3; i++) {
		                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
		                    return true;
		                }
		                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
		                    return true;
		                }
		            }
		        
		        // Check diagonals
		        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
		            return true;
		        }
		        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
		            return true;
		        }

		        return false;
		    
		        }
		    // Check if the board is full
		    private static boolean isBoardFull() {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (board[i][j] == '_') {
		                    return false;
		                }
		            }
		        }
		        return true;
		    
		}
}


