package Java;

import java.util.*;

public class Main {
    public enum Days{Su,M,Tu,W,Th,F,Sa};
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        Threads th=new Threads();
    }
}

class Threads
{
    int count;

    public synchronized void Increase() {
        
        for(int i=0;i<10;i++){
            count++;
        }
    }

    int getCount()
    {
        return count;
    }
}