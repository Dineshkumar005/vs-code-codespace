import java.util.*;

class Node{
    int data;
    Node Right,Left;
    Node(int data){
        this.data=data;
        Right=null;
        Left=null;
    }
}

public class BT {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        int t=sn.nextInt();
        while(t-->0){
            int n=sn.nextInt();
            Node root=new Node(sn.nextInt());
            while(n-->1)
                root=Insert(root, sn.nextInt());
            
        }

        sn.close();
    }

    static Node Insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(root.data>data)
            root.Left=Insert(root.Left, data);
        else
            root.Right=Insert(root.Right, data);
        return root;
    }
}
