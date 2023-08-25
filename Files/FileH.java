package Files;

import java.io.*;
import java.util.Arrays;

class FileH {
    public static void main(String[] args) {

        try {
            File f = new File("Files/Data.txt");
            RandomAccessFile ra = new RandomAccessFile(f, "rw");
            
            String str="";
            while((str=ra.readLine())!=null){
                //ra.seek(ra.getFilePointer()-str.length()-1);
                String[] words=str.split(" ");

                System.out.println(str);
                str="";
                // for(int i=0;i<words.length;i++){
                //     try {
                //         int num=Integer.parseInt(words[i]);
                //         num++;
                //         System.out.println(num+" "+Arrays.toString(words));
                //         words[i]=num+"";
                //     } catch (Exception e) {
                //         //System.out.println(word);
                //     }
                //     str+=words[i]+" ";
                // }
                // ra.write((str).getBytes());
            }
            // ra.seek(pos);
            // System.out.println(ra.readLine());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}