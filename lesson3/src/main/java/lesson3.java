import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Создание массива из N-элементов. Пожалуйста, введите число N в диапазоне 1<n<21");
            n = scan.nextInt();
        } while (n<1 || n>20);
        createArrayNthElements(n);
        createArray100();
        createArrayMultiplySomeValues();
        createArrayDiagonalOnes();
        System.out.println("5. createArrayNthElementsInitialValue");
        returnN();
        n = 10;
        int init = 5;
        createArrayNthElementsInitialValue(n,init);
        findMaxMininMassive(createArrayNthElementsRandomValues(20));
        int[] arr1 = {1,0,1,1,1,0};
        boolean hasEqual = checkBalance(arr1);
        System.out.println("");
        System.out.println(hasEqual);
    }

    public static int[] createArrayNthElements(int n)  {
        int[] arr = new int[n];
        Random ran = new Random(1);
        for (int i = 0; i < n; i++) {
            arr[i] =  ran.nextInt(2);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static int[] createArrayNthElementsRandomValues(int n)  {
        int[] arr = new int[n];
        Random ran = new Random(100);
        for (int i = 0; i < n; i++) {
            arr[i] =  ran.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }


    public static void createArray100() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(i + ",");
        }
    }

    public static void createArrayMultiplySomeValues() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("default Array=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) { arr[i] *=2;
            }
        }
        System.out.println("arr[i] < 6 multiply2. modified Array=" + Arrays.toString(arr));
    }

    public static void createArrayDiagonalOnes() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr[i].length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (i == j || i == arr[i].length - j - 2) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static int[] createArrayNthElementsInitialValue(int len, int initialValue)  {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] =  initialValue;
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static int returnN() {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Пожалуйста, введите целочисленное число N . 2раза. баг пока ен отловил");
            n = scan.nextInt();
        } while (!scan.hasNextInt());
        return n;
    }

    public static void findMaxMininMassive(int massive[]) {
        int min = massive[0];
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (min > massive[i]) {
                min = massive[i];
            }
            if (max < massive[i]) {
                max = massive[i];
            }
        }
        System.out.println("");
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static boolean checkBalance (int[] arr){
        int sumleft[] = new int[6];
        int sumright[] = new int[6];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 ) {
                sumleft[i] = sumleft[i-1] +arr[i];
            } else sumleft[i] += arr[i];

            }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != arr.length - 1 && i != 0) {
                sumright[i] = sumright[i+1] + arr[i];
            } else if (i == arr.length -1 ) {
                sumright[arr.length - 1] = arr[i];
            } else if (i == 0 ) {
                sumright[i] = sumright[i+1] + arr[i];
            }
        }

        int i = arr.length -1;
        while (i > 0) {

            for (int j = 0; j < arr.length; j++) {
                if (sumleft[i] == sumright[arr.length - j - 1]) {
                    return true;
                }
//да, косяк в формуле сравнения есть, если подскажете как правильно все вариации сравнить - буду благодарен)
            }
            i--;
        }
        System.out.println(Arrays.toString(sumleft));
        System.out.println(Arrays.toString(sumright));

            return false;
        }

}

