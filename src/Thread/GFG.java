package Thread;

import java.util.Arrays;
import java.util.Scanner;

class main {
    public static int kthLargest(int[] arr, int K)
    {
        Arrays.sort(arr);
        return arr[K + 1];
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5] ;
        for (int i=0;i<5;i++) {
        arr[i]=sc.nextInt();
        }
        int K ;
//        System.out.println("enter k");
        K=sc.nextInt();

        System.out.print(
                + kthLargest(arr, K));
    }
}