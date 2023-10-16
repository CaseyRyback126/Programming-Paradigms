package TicTacToe;

import java.util.Scanner;

import static TicTacToe.Game.*;
import static TicTacToe.TicTacToe.currentPlayer;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Крестики-нолики!");
        System.out.println("Игровая доска имеет размер 3x3. Введите координаты в формате 'строка колонка'.");

        while (true) {
            game.printBoard();
            System.out.println("Ход игрока " + currentPlayer);
            System.out.print("Введите координаты: ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (makeMove(row, col)) {
                if (checkWin()) {
                    game.printBoard();
                    System.out.println("Игрок " + currentPlayer + " победил!");
                    break;
                } else if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("Ничья!");
                    break;
                }

                game.switchPlayer();
            } else {
                System.out.println("Некорректный ход. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
