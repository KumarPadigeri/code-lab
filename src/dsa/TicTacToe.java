package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        // 1. initialize board 3 x 3
        char[][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[row].length; col++) {
//                board[row][col] = ' ';
//            }
//        }


        char player = 'X';

        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!gameOver) {
            printBoard(board);
            System.out.println("Enter " + player + " input: ");

            int row = sc.nextInt();
            int col = sc.nextInt();


            if (board[row][col] == ' ') {
                board[row][col] = player;
                boolean won = isWon(board, player);
                if (won) {
                    System.out.println("Player " + player + " Won");
                    gameOver = true;
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else
                        player = 'X';

                }

            } else {
                System.out.println("Invalid Input");
            }


        }


    }

    private static boolean isWon(char[][] board, char player) {
        //row check
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        //col check
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        return board[2][0] == player && board[1][1] == player && board[0][2] == player;

    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }

//
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[row].length; col++) {
//                System.out.print(board[row][col] + " | ");
//            }
//            System.out.println();
//        }

    }


}
