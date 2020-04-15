import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int r;
        int i=0;
        int max=0;
        int val=0;
    
       
        while(n>0){
            r=n%2;
            arr[i]=r;
            i++;
            n=n/2;
        }      
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                val++;
            }
            else if(arr[j]==0){
                if(val>max){
                    max=val;
                }
                val=0;
            }
        }

        System.out.print(max);

    }
}
