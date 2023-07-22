package Java;

import java.util.*;

public class PartOne {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
    
        

        System.out.println();
        sn.close();
    }


    public static void Reverse(Scanner sn)
    {
        String str=sn.nextLine();
        for(int i=str.length()-1;i>=0;i--)
            str+=str.charAt(i);
        
        str=str.substring(str.length()/2);
        System.out.println(str);
    }

    public static boolean CheckPrime(int n)
    {
       boolean isPrime=true;
       
       int d=2;
       for(int i=2;i<n/2;i++){
            if(n%i==0)
            {
                d=i;
                isPrime=false;
                break;
            }
       }

       return isPrime;
    }

    public static void LCM(Scanner sn)
    {
        int n=sn.nextInt();
        int[] arr=new int[n];
        int lcm=1;

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
            lcm=arr[i]*lcm;
        }
        
        int gcd=arr[0];
        for(int i=1;i<n;i++)
        {
            gcd=GCD(gcd,arr[i]);
        }


        lcm=lcm/gcd;

        System.out.println("LCM: "+lcm);
        System.out.println("GCD: "+gcd);
    }

    public static int GCD(int a,int b)
    {
        if(b==0)
            return a;
        return GCD(b,a%b);
    }

    static void Min2nd(Scanner sn)
    {
        int n=sn.nextInt();
        int[] arr=new int[n];
        int min1,min2;

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }

        min1=arr[0];
        min2=arr[0];

        for(int i=1;i<n;i++)
        {
            if(min1>arr[i]){
                min1=arr[i];
            }
            else if(min2>arr[i]){
                min2=arr[i];
            }
        }

        System.out.println("min 2 : " +min2);
    }

    public static void Palindrome(Scanner sn)
    {
        String str=sn.nextLine(),temp="";
        for(int i=str.length()-1;i>=0;i--)
            temp+=str.charAt(i);
        
        if(str.equals(temp))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


    }
}