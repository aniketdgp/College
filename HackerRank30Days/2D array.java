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
        int[][] arr = new int[6][6];
        int[] values = new int[16];
        int p=0;
        int max;
        int sum=0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {            
                arr[i][j] = scanner.nextInt();
            }
        }


           for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) { 
                if(i>3 || j>3){
                    break;
                }
                else{                           
               sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                }

            values[p]=sum;
            p++;

            }
               

        }

max = values[0];
 
for(int l=0;l<p;l++){
    
    if(values[l]>max){
max = values[l];
    }
  
    
   
}

System.out.println(max);

    }
}
