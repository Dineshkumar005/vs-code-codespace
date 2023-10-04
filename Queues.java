import java.util.*;

class Queues
{
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        int t=sn.nextInt();
        while(t-->0){
            Queue<Integer> max=new PriorityQueue<Integer>(),min=new PriorityQueue<Integer>(Collections.reverseOrder());
            int n=sn.nextInt();
            int count=0;
            while (n-- > 0) {
                if (min.size() <= max.size()) {
                    min.add(sn.nextInt());
                }
                else {
                    max.add(sn.nextInt());
                }
                while (!(min.isEmpty() || max.isEmpty())  && min.peek() > max.peek()) {
                    int temp = min.poll();
                    min.add(max.poll());
                    max.add(temp);
                    System.out.print("...");
                    count++;
                }
                System.out.print(min.peek()+" ");
            }
            System.out.println("count :"+count);
        }
        sn.close();
        
    }
}