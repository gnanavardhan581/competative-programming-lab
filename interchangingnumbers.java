import java.io.*;
import java.util.*;

public class MinMaxSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maximum= Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int minidx=0;
        int maxidx=0;
        for(int i = 0 ; i< n;i++){
            arr[i]=sc.nextInt();
            if(maximum<arr[i]){
                maximum = arr[i];
                maxidx=i;
            }
            if(minimum>arr[i]){
                minimum = arr[i];
                minidx=i;
            }
        }
        int temp =arr[maxidx];
        arr[maxidx]=arr[minidx];
        arr[minidx]= temp;
         for(int i = 0 ; i< n;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
