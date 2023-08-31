package Java;

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        Diamond(n);
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
        System.out.println();
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
        System.out.println();
    }

    static void Apattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n*2-1; j++) {
                if((i+j==n-1 || j==n+i-1)  || (i==(int)n/2 && i+j>n-1 && j<n+i-1)){
                    System.out.print("A");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void NumPattern(int n) {
        for(int i=0,l=n+1;i<n*2-1;i++,l=n+1){
            for(int j=0;j<n*2-1;j++){
                
                if(j<i+1){
                    l--;
                }
                if(j>n*2-i-2){
                    l++;
                }

                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void Diamond(int n)
    {
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){
                if((!(i+j>=n-1 && j<=i+n-1 )|| (i-n<=j-1 && j+i<=n*2+2)) && (i+j>=n-1 && j<=i+n-1 )){
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
