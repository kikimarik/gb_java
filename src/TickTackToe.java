import java.util.Random;
import java.util.Scanner;

public class TickTackToe {
    private static final char EMPTY_FIELD = '.';
    private static final char USER_MARKER = 'x';
    private static final char AI_MARKER = 'o';
    private static final int BOARD_SIZE = 3;

    private char[][] board = new char[TickTackToe.BOARD_SIZE][TickTackToe.BOARD_SIZE];

    public static void main(String[] args) {
        TickTackToe instance = new TickTackToe();
        instance.run();
    }

    public void run() {
        this.setBoard();
        Scanner scanner = new Scanner(System.in);
        this.runGame(scanner);
        scanner.close();
    }

    private void setBoard() {
        for (int rowIndex = 0; rowIndex < TickTackToe.BOARD_SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < TickTackToe.BOARD_SIZE; colIndex++) {
                this.board[rowIndex][colIndex] = TickTackToe.EMPTY_FIELD;
            }
        }
    }

    private void rebuildBoard(char marker, int x, int y) {
        this.board[x][y] = marker;
    }

    private void viewBoard() {
        for (int rowIndex = 0; rowIndex < TickTackToe.BOARD_SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < TickTackToe.BOARD_SIZE; colIndex++) {
                System.out.print(this.board[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }

    private void runGame(Scanner scanner) {
        this.viewBoard();
        System.out.println("Please choice x coordinate\n");
        int x = scanner.nextInt(TickTackToe.BOARD_SIZE + 1) - 1;
        System.out.println("Please choice y coordinate\n");
        int y = scanner.nextInt(TickTackToe.BOARD_SIZE + 1) - 1;
        int[] aiCoordinates = getAiChoice();
        int aiX = aiCoordinates[0];
        int aiY = aiCoordinates[1];
        if (!this.turn(TickTackToe.USER_MARKER, x, y)) {
            this.turn(TickTackToe.AI_MARKER, aiX, aiY);
            this.runGame(scanner);
        }
    }

    private int[] getAiChoice() {
        Random random = new Random();
        int[] coordinates = new int[2];
        coordinates[0] = random.nextInt(TickTackToe.BOARD_SIZE);
        coordinates[1] = random.nextInt(TickTackToe.BOARD_SIZE);

        return coordinates;
    }

    private boolean turn(char marker, int x, int y) {
        if (this.isEmptyCell(x, y)) {
            this.rebuildBoard(marker, x, y);
            if (this.isEndOfGame(marker)) {
                this.viewBoard();
                System.out.println(marker == TickTackToe.USER_MARKER ? "You win!" : "You lose...");

                return true;
            }
        } else {
            if (marker == TickTackToe.AI_MARKER) {
                int[] aiCoordinates = getAiChoice();
                int aiX = aiCoordinates[0];
                int aiY = aiCoordinates[1];
                return this.turn(marker, aiX, aiY);
            }
            System.out.println("Invalid Cell!");
        }

        return false;
    }

    private boolean isEndOfGame(char marker) {
        int rowCounter = 0;
        int colCounter = 0;
        int firstDiagonalCounter = 0;
        int secondDiagonalCounter = 0;
        for (int rowIndex = 0; rowIndex < TickTackToe.BOARD_SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < TickTackToe.BOARD_SIZE; colIndex++) {
                if (this.board[rowIndex][colIndex] == marker) {
                    rowCounter++;
                }
                if (this.board[colIndex][rowIndex] == marker) {
                    colCounter++;
                }
                if (colIndex == rowIndex && this.board[rowIndex][colIndex] == marker) {
                    firstDiagonalCounter++;
                }
                if (colIndex == TickTackToe.BOARD_SIZE - 1 - rowIndex && this.board[rowIndex][colIndex] == marker) {
                    secondDiagonalCounter++;
                }
            }
            if (Math.max(rowCounter, colCounter) == TickTackToe.BOARD_SIZE) {
                return true;
            } else {
                rowCounter = 0;
                colCounter = 0;
            }
        }
        int counter = Math.max(firstDiagonalCounter, secondDiagonalCounter);
        return counter == TickTackToe.BOARD_SIZE;
    }

    private boolean isEmptyCell(int x, int y) {
        return this.board[x][y] == TickTackToe.EMPTY_FIELD;
    }
}
