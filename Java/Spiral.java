package Java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");

        int n = sn.nextInt();
        Random random = new Random();
        int[] arr = new int[n * n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(0, 100);

        Arrays.sort(arr);
        int[][] spiral = new int[n][n];
        int count = 0;
        int minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

        try {
            while (count < n * n) {
                for (int i = minCol; i <= maxCol; i++)
                    spiral[minRow][i] = arr[count++];

                for (int i = minRow + 1; i <= maxRow; i++)
                    spiral[i][maxCol] = arr[count++];

                for (int i = maxCol - 1; i >= minCol; i--)
                    spiral[maxRow][i] = arr[count++];

                for (int i = maxRow - 1; i >= minRow + 1; i--)
                    spiral[i][minCol] = arr[count++];

                minRow++;
                maxRow--;
                minCol++;
                maxCol--;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(spiral[i][j] + "\t");
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(count + " " + arr.length);
        }
        finally{
            System.out.println(count + " " + arr.length);
        }
    }
}