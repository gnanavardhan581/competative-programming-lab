import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        for( int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2 = new int[m];
        for( int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }
        int f=0;
        int s=0;
        int[] res = new int[n+m];
        int k=0;
        while(f!=n&&s!=m){
            if(arr1[f]<arr2[s]){
                res[k]= arr1[f];
                f++;
            }
            else{
                res[k]=arr2[s];
                s++;
            }
            k++;
        }
        while (f < n) {
            res[k] = arr1[f];
            f++;
            k++;
        }
        while (s < m) {
            res[k] = arr2[s];
            s++;
            k++;
        }
        for(int i =0; i<(n+m);i++){
            System.out.print(res[i]+" ");
        }
    }
}
