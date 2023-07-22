package Java;

import java.util.*;

public class PartTwo {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        PrimesBetween(sn);

        sn.close();
    }

    static void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println(fact);
    }

    static void RemoveVowels(Scanner sn)
    {
        String str=sn.nextLine();
        
        str=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str);
    }
    

    static void LCM(int a,int b)
    {
        int lcm=a>b?a:b;
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
            {
                System.out.println(lcm);
                return;
            }
            lcm++;
        }
    }

    static void NoOfWords(Scanner sn)
    {
        String str=sn.nextLine();
        int count=str.split(" ").length;
        System.out.println(count);
    }

    static void NoOfDigits(Scanner sn)
    {
        int n=sn.nextInt();
        n=(int)Math.log10(n)+1;
        System.out.println(n);
    }


    static void PrimesBetween(Scanner sn)
    {
        int a=sn.nextInt(),b=sn.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(PartOne.CheckPrime(i))
                System.out.println(i);
        }
    }


    static void CharCount(Scanner sn)
    {
        Map<Character,Integer> map=new java.util.HashMap<>();
    }
}
