import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maj {

    public static void main(String[] args) {
        int count =1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        boolean maj= false;
        for(int i = 1 ; i<n; i++){
            if(arr[i]==arr[i-1])
                {
                    count++;
            if(count>=(n/2)){
                maj=true;
                System.out.println(arr[i]) ;
                break;
            }
                }
            else{
                count=1;
            }
            
        }
            if(!maj)
                System.out.println(-1) ;
    }
}
