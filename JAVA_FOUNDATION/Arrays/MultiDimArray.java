package Arrays;

import java.util.Scanner;

public class MultiDimArray {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size:"+" ");
        n=scanner.nextInt();

        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] result = new int[n][n];

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                arr1[k][l] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=0; k < n; k++)
                {
                    result[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



    }

}
