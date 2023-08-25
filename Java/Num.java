package Java;

import java.util.Arrays;
import java.util.Random;

public class Num {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10, 50);
        int[] arr = new int[n];
        //int[] ans = new int[6];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(Arrays.stream(arr).filter(i -> i % 2 == 1).toArray()));

        // for (int i = 0, j = 0; i < n && j < 3; i++) {
        //     if (arr[i] % 2 == 1) {

        //         boolean isPresent = false;
        //         for (int k = 0; k < 3; k++) {
        //             if (ans[k] == arr[i]) {
        //                 isPresent = true;
        //                 break;
        //             }
        //         }

        //         if (!isPresent) {
        //             ans[j] = arr[i];
        //             j++;
        //         }
        //     }
        // }
        
        // for (int i = n-1, j = 5; i >= 0 && j > 2; i--) {
        //     if (arr[i] % 2 == 1) {

        //         boolean isPresent = false;
        //         for (int k = 0; k < 6; k++) {
        //             if (ans[k] == arr[i]) {
        //                 isPresent = true;
        //                 break;
        //             }
        //         }

        //         if (!isPresent) {
        //             ans[j] = arr[i];
        //             j--;
        //         }
        //     }
        // }
        
        // System.out.println(Arrays.toString(ans));
        // System.out.println(arr.length);
        System.out.println(Arrays.toString(Arrays.stream(arr).sorted().filter(i -> i % 2 == 1).toArray()));
        arr=Arrays.stream(arr).filter(i -> i % 2 == 1).sorted().distinct().toArray();
        for (int i = 0; i < 3; i++) 
            System.out.println(arr[i]);
        for (int i = arr.length-3; i <arr.length; i++) 
            System.out.println(arr[i]);
    }
}
