import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    public static final int SIZE = 4;
    public static final char CHAR_PLAYER_X = 'X';
    public static final char CHAR_PLAYER_0 = '0';
    public static final char CHAR_FREE = '*';
    public static char map[][];
    final static int winCount = 3;
    public static Scanner scan;




    public static void main(String[] args) {
        mapInit();
        mapDraw();

        while (!isMapFull()) {
            if (isMapFull()) {
                break;
            }
            playerTurn();
            mapDraw();
            if (isMapFull() || isWin(CHAR_PLAYER_X)) {
                break;
            }
            AITurn();
            mapDraw();
            if (isMapFull() || isWin(CHAR_PLAYER_0)) {
                break;
            }
        }



    }

    public static void mapInit() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = CHAR_FREE;
            }
        }
    }

    public static void mapDraw() {
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print((i + 1) + " ");
        }
        System.out.println("");

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == CHAR_FREE) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isTurnValid(int i, int j, char playerChar) {
        if ((map[i][j] != CHAR_PLAYER_0) && (map[i][j] != CHAR_PLAYER_X) && (map[i][j]
                == CHAR_FREE) && (i < SIZE) && (j < SIZE) && (j >= 0) && (i >= 0)) {
            return true;
        }
        return false;
    }


    public static void playerTurn() {
        int x,y;
        scan = new Scanner(System.in);
        do {
            System.out.println("Пожалуйста, введите координаты хода в формате: x,y");
            x = scan.nextInt();
            y = scan.nextInt();
        } while (!isTurnValid(x - 1,y - 1 ,CHAR_PLAYER_X));

        System.out.println("x=" + x);
        System.out.println("y=" + y);

        map[x - 1][y - 1] = CHAR_PLAYER_X;
    }

    public static void AITurn() {
        int x,y;
        Random rand = new Random();
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);

        } while (!isTurnValid(x,y,CHAR_PLAYER_X));
        map[x][y] = CHAR_PLAYER_0;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }

    public static boolean isWin(char Player) {

        //check string for win
        int sumI = 0;
        int isStr = 0;
        for (int i = 0; i < SIZE; i++) {
            isStr = i;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == Player && (isStr == i)) {
                    sumI += 1;
                    if (sumI == winCount) {
                        System.out.println("Вы выиграли");
                        return true;
                    }

                } else if (sumI < winCount && map[i][j] != Player) {
                    sumI = 0;
                }
            }

            sumI = 0;
            isStr = 999;
        }

////        //check column - not proper work
        int sumJ = 0;
        int isCol = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                isCol = 0;
                if (map[i][j] == Player && (isCol == j)) {
                    sumJ += 1;
                    System.out.println(sumJ);
                    if (sumJ == winCount) {
                        System.out.println("Вы выиграли");
                        return true;
                    }
//                    else if (sumJ < winCount && map[i][isCol] != Player) {
//                        sumJ = 0;
//                    }
                }
            }

            //sumJ = 0;
            isCol = 999;
        }






        return false;
    }


}
