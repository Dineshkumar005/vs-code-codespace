import java.util.*;

public class FrequencyLists
{
    class Frequency {
        int n, c;
        @Override
        public boolean equals(Object obj){
            Frequency f = (Frequency) obj;
            if (n == f.n)
                return true;
            return false;
        }
    }
    class FrequencyComparator implements Comparator<Frequency>
    {
        public int compare(Frequency A,Frequency B) {
            if (A.c == B.c)
                return A.n - B.n;
            return A.c - B.c;
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int t = sn.nextInt();
        FrequencyLists m = new FrequencyLists();
        while(t-->0){
            int n=sn.nextInt();
            List<Frequency> f = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Frequency fr = m.new Frequency();
                fr.n = sn.nextInt();
                fr.c = 1;
                if (f.contains(fr))
                    f.get(f.indexOf(fr)).c++;
                else
                    f.add(fr);
            }
            Collections.sort(f, m.new FrequencyComparator());
            for (Frequency fq : f) {
                for(int j=0;j<fq.c;j++)
                    System.out.print(fq.n+" ");
            }
            System.out.println();
        }
    }
}