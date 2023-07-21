import java.util.*;

public class TicTacToeGame {
    // Constants for board dimensions and symbols
    private static final int BOARD_SIZE = 3;
    private static final char USER_SYMBOL = 'X';
    private static final char CPU_SYMBOL = 'O';
    private static final char EMPTY_SYMBOL = ' ';

    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Welcome the user and provide instructions for the game
        System.out.println("Welcome to Hussein's Tic-Tac-Toe Game!");
        System.out.println("Instructions: Enter the row and column (both starting from 1) to place your symbol on the board.");

        // Initialize the board with empty symbols
        initializeBoard();

        // Randomly decide if the user is 'X' or 'O'
        char userSymbol = (Math.random() < 0.5) ? USER_SYMBOL : CPU_SYMBOL;
        char cpuSymbol = (userSymbol == USER_SYMBOL) ? CPU_SYMBOL : USER_SYMBOL;

        System.out.println("You are '" + userSymbol + "' and the CPU is '" + cpuSymbol + "'.");

        // Main game loop
        boolean isUserTurn = (userSymbol == USER_SYMBOL);
        boolean gameEnded = false;
        while (!gameEnded) {
            printGameBoard();

            if (isUserTurn) {
                userTurn(userSymbol);
            } else {
                cpuTurn(cpuSymbol);
            }

            if (checkWinner(userSymbol)) {
                printGameBoard();
                System.out.println("Congratulations! You won!");
                gameEnded = true;
            } else if (checkWinner(cpuSymbol)) {
                printGameBoard();
                System.out.println("You lost! CPU won!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printGameBoard();
                System.out.println("It's a tie!");
                gameEnded = true;
            }

            isUserTurn = !isUserTurn; // Switches turns
        }

        scanner.close();
    }

    // Initialize the board with empty symbols
    private static void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_SYMBOL;
            }
        }
    }

    // Printing the current game board
    private static void printGameBoard() {
        System.out.println("-------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

    // The method to work with the user's turn
    private static void userTurn(char userSymbol) {
        int row, col;
        do {
            System.out.print("Enter row (1-3): ");
            row = scanner.nextInt() - 1;

            System.out.print("Enter column (1-3): ");
            col = scanner.nextInt() - 1;

            // To check if the input is valid and that the spot is not already taken
            if (row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == EMPTY_SYMBOL) {
                board[row][col] = userSymbol;
                return;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        } while (true);
    }

    // Handling CPU's turn (random)
    private static void cpuTurn(char cpuSymbol) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(BOARD_SIZE);
            col = random.nextInt(BOARD_SIZE);
        } while (board[row][col] != EMPTY_SYMBOL);

        board[row][col] = cpuSymbol;
    }

    // Checking if the given symbol has won the game
    private static boolean checkWinner(char symbol) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true; // Row check
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true; // Column check
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true; // Diagonal check from the top-left to bottom-right
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true; // Diagonal check from the top-right to bottom-left
        }
        return false;
    }

    // Checks if the board is full (tie condition)
    private static boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY_SYMBOL) {
                    return false;
                }
            }
        }
        return true;
    }
}
