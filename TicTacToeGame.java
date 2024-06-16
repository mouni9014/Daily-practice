public class TicTacToeGame {
    private char[][] board; // 3x3 board representation
    private char currentPlayer; // 'X' or 'O'
    private boolean gameEnded;

    public TicTacToeGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameEnded = false;
        initializeBoard();
    }

    private void initializeBoard() {
        // Initialize board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Method to handle a move by current player
    public void makeMove(int row, int col) {
        if (board[row][col] == ' ' && !gameEnded) {
            board[row][col] = currentPlayer;
            
            // Print current board state
            printBoard();
            
            // Check if there is a winner
            char winner = checkWinner();
            if (winner != ' ') {
                gameEnded = true;
                System.out.println("Player " + winner + " wins!");
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        } else {
            System.out.println("Invalid move. Please try again.");
        }
    }

    // Method to check if there's a winner
    private char checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        
        // Check for tie
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    tie = false;
                    break;
                }
            }
        }
        if (tie) {
            gameEnded = true;
            System.out.println("It's a tie!");
            return ' ';
        }

        return ' '; // No winner yet
    }

    // Method to reset the game
    public void resetGame() {
        initializeBoard();
        currentPlayer = 'X';
        gameEnded = false;
    }

    // Method to print the current board state
    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();

        // Example gameplay
        game.makeMove(0, 0); // X moves
        game.makeMove(1, 1); // O moves
        game.makeMove(0, 1); // X moves
        game.makeMove(1, 0); // O moves
        game.makeMove(0, 2); // X moves

        // Additional moves to show different game outcomes
        // game.makeMove(1, 2); // O moves (O wins vertically)
        //game.makeMove(2, 2); // X moves (X wins diagonally)
        //game.makeMove(2, 1); // O moves (It's a tie)

        // Reset game for another round
        // game.resetGame();
    }
}
