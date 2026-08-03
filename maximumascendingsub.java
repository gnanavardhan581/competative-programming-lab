import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int[] arr = new int[n];
      for(int i =0; i< n; i++){
        arr[i]= sc.nextInt();
      }
      int maximum = arr[0];
      int ans = arr[0];
      for(int i =1; i< n; i++){
        if(arr[i]>arr[i-1]){
            maximum= arr[i]+maximum;
        }
        else    {
            maximum=arr[i];
        }
        ans=Math.max(ans,maximum);
      }
      System.out.println(ans);
    }
}
