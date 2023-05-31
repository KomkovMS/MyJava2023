package Hw5;

import java.util.ArrayList;

/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
 */
public class Hw5_Task3 {
    private static final int BOARD_SIZE = 8;
    private static final char QUEEN_SYMBOL = '♛';
    private static final char EMPTY_SYMBOL = '□';

    private static char[][] chessBoard;

    public static void main(String[] args) {
        chessBoard = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();

        solveQueensProblem(0);

        if (solutions.isEmpty()) {
            System.out.println("Решения не найдены");
        } else {
            int count = 1;
            for (char[][] solution : solutions) {
                System.out.println("Вариант " + count + ":");
                printBoard(solution);
                System.out.println();
                count++;
            }
            System.out.println("Всего найдено решений: " + solutions.size());
        }
    }

    /**
     * Инициализирует шахматную доску пустыми символами.
     */
    private static void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                chessBoard[row][col] = EMPTY_SYMBOL;
            }
        }
    }

    private static ArrayList<char[][]> solutions = new ArrayList<>();

    /**
     * Рекурсивно решает задачу о размещении ферзей на шахматной доске.
     *
     * @param col текущий столбец
     */
    private static void solveQueensProblem(int col) {
        if (col >= BOARD_SIZE) {
            char[][] solution = new char[BOARD_SIZE][BOARD_SIZE];
            for (int i = 0; i < BOARD_SIZE; i++) {
                System.arraycopy(chessBoard[i], 0, solution[i], 0,
                        BOARD_SIZE);
            }
            solutions.add(solution);
        } else {
            for (int row = 0; row < BOARD_SIZE; row++) {
                if (isSafe(row, col)) {
                    chessBoard[row][col] = QUEEN_SYMBOL;
                    solveQueensProblem(col + 1);
                    chessBoard[row][col] = EMPTY_SYMBOL; // Откат хода
                }
            }
        }
    }

    /**
     * Проверяет, является ли позиция безопасной для размещения ферзя.
     *
     * @param row текущая строка
     * @param col текущий столбец
     * @return true, если позиция безопасна, иначе false
     */
    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (chessBoard[row][i] == QUEEN_SYMBOL) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == QUEEN_SYMBOL) {
                return false;
            }
        }

        for (int i = row, j = col; i < BOARD_SIZE && j >= 0; i++, j--) {
            if (chessBoard[i][j] == QUEEN_SYMBOL) {
                return false;
            }
        }

        return true;
    }

    /**
     * Выводит шахматную доску с размещенными ферзями.
     * @param board шахматная доска
     */
    private static void printBoard(char[][] board) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
