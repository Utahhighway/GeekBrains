package Lesson3;

import java.util.Random;

public class MainClass {
    static Random random;

    public static void main(String[] arg) {
        random = new Random();
       printArr(factoryArr(5, 50));
    }


    static int [][] factoryArr(int n, int max) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(max);
            }
        }
        return arr;
    }

        static void printArr ( int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%3d", arr[i][j]);
                }
                System.out.println();
            }
        }

    }
