package morozova.projects;

import java.util.Scanner;

public class GameXO {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Human win");
                break;
            }
            if(checkDiagonals(DOT_X)){
                System.out.println("Human win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTern();
            printMap();
            if (checkDiagonals(DOT_O)) {
                System.out.println("ai Win");
                break;
            }
            if(checkWin(DOT_O)){
                System.out.println("ai win");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i < SIZE + 1; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", (i + 1));
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Ваш ход: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTern() {
        int x, y;
        do {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    //    public static boolean checkWin(char symb) {
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) return true;
//
//        return false;
//    }
    public static boolean checkDiagonals(char symb) {
        boolean rightDiagonal = true;
        boolean leftDiagonal = true;
        for (int i = 0; i < SIZE; i++) {
            rightDiagonal = rightDiagonal & (map[i][i] == symb);
            leftDiagonal = leftDiagonal & (map[SIZE - i - 1][i] == symb);
        }
        if (rightDiagonal || leftDiagonal) return true;

        return false;
    }

    public static boolean checkWin(char symb) {
        boolean horizont;
        boolean vertical;
        for (int i = 0; i < SIZE; i++) {
            horizont = true;
            vertical = true;
            for (int j = 0; j < SIZE; j++) {
                horizont = horizont & (map[i][j] == symb);
                vertical = vertical & (map[i][j] == symb);
            }
            if (horizont || vertical) return true;
        }
        return false;
    }
}
