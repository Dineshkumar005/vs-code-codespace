import java.util.*;

class NODE<T>
{
    T data;
    NODE<T> next;
    NODE(T data){
        this.data=data;
    }
}

public class LL {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        NODE<Integer> head=new NODE<>(0),temp=head;
        for(int i=1;i<=10;i++){
            temp.next=new NODE<>(i);
            temp=temp.next;
        }
        PritntLL(head);
        temp=Reverse(head);
        PritntLL(temp);
    }

    static void PritntLL(NODE<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    static NODE<Integer> Reverse(NODE<Integer> head)
    {
        NODE<Integer> current=head,previous=null,next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}