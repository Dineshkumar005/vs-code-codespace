package Java;

import java.util.Scanner;

public class PointsInCircle {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int[] c1=new int[3];
        int[] c2=new int[3];
        for(int i=0;i<3;i++) {
            c1[i]=sn.nextInt();
        }
        for(int i=0;i<3;i++) {
            c2[i]=sn.nextInt();
        }
        sn.close();
        System.out.println(GetNoOfPoints(c1, c2));
    }

    public static int GetNoOfPoints(int[] c1,int[] c2) {
        int count=0;

        for(int i=Math.max(c1[0]-c1[2], c2[0]-c2[2]);i<=Math.min(c1[0]+c1[2], c2[0]+c2[2]);i++) {
            for(int j=Math.max(c1[1]-c1[2], c2[1]-c2[2]);j<=Math.min(c1[1]+c1[2], c2[1]+c2[2]);j++) {
                if(IsCommen(c1, c2, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean IsCommen(int[] c1,int[] c2,int x,int y) {
        int d1=(x-c1[0])*(x-c1[0])+(y-c1[1])*(y-c1[1]);
        int d2=(x-c2[0])*(x-c2[0])+(y-c2[1])*(y-c2[1]);
        return d1<=c1[2]*c1[2] && d2<=c2[2]*c2[2] && d1>=c1[2]*c1[2] && d2>=c2[2]*c2[2];
    }
}