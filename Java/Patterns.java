package Java;

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        UsingDiagonls(n);
        XBoxPattern(n);
    }

    static void XBoxPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==0 | i==0 || i==n-1 || j==n-1 || i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void UsingDiagonls(int n)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=i*2 && i+j>=n-1 || i+j<=i*2 && i+j<=n-1){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
