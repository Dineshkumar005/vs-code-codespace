package Java;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        CodeMonk();

        sn.close();
    }

    static void ArrayRotataion(int r)
    {
        Random rand = new Random();
        int n=rand.nextInt(5,10);
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);
        }

        System.out.println("Array: "+Arrays.toString(arr));

        r=r%n;
        for(int i=0;i<r;i++){
            int t=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=t;
        }
        
        System.out.println("After Rotation:"+ Arrays.toString(arr));
    }

    static void CodeMonk(){
        Scanner sn=new Scanner(System.in);
        int t=sn.nextInt();
        for(int a=0;a<t;a++){
            int n=sn.nextInt(),c=1;
            int k=sn.nextInt(); 
            String str=sn.next(),temp=str;
            

            long max=Long.valueOf(str, 2);

            for(int i=0;i<n;i++){
                temp=temp.substring(1)+temp.charAt(0);
                long tn=Long.valueOf(temp, 2);
                if(tn>max){
                    max=tn;
                    c=i+1;
                    str=temp;
                }
            }
        
            System.out.println(c);
        }
        sn.close();
    }
}