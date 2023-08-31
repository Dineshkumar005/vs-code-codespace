package Java;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Xpattern(5);

    }

    static void Inversions() {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sn.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int a = i; a < n; a++) {
                    for (int b = j; b < n; b++) {
                        if (arr[i][j] > arr[a][b])
                            count++;
                    }
                }
            }
        }

        System.out.println(count);

        sn.close();
    }

    static void Rotate() {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sn.nextInt();
            int arr[] = new int[n];
            int q = sn.nextInt();

            q = q % n;
            while (n > 0) {
                if (q >= arr.length) {
                    q = 0;
                }
                arr[q] = sn.nextInt();
                q++;
                n--;
            }

            for (int j : arr)
                System.out.print(j + " ");

        }
        sn.close();
    }

    static void Xpattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j || i+j==n-1) && !(i==j && i+j==n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
