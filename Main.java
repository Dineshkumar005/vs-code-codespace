// import java.util.*;
// import java.io.*;
// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node() {

//     }

//     Node(int data) {
//         this.data = data;
//     }
// }

// public class Main {
// public static void main(String[] args) throws Exception
// {
//     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     int n=Integer.parseInt(br.readLine());
//     String[] arr=br.readLine().split(" ");
//     int [] a=new int [arr.length];
//     for(int j=0;jr.data)
//     {
//         if(r.right==null){
//             Node l=new Node(t);
//             r.right=l;
//         }
//         else{
//             create(r.right,t);
//         }
//     }
// }
// }