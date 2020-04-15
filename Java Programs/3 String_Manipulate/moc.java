/*
1) How to find the maximum occurring character in given String? (solution)
Write an efficient Java/C/Python program to return the maximum occurring character in the 
input string, e.g., if the input string is "Java" then the function should return 'a'.
*/
import java.util.*;
class Moc{

    static void find(String s){

        String[] arr = s.split("");
        int count;
        int[] value = new int[arr.length];

        for(int i=0;i<arr.length;i++){
             count =0;
            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j]){
                      count++;  
                }

                value[i] = count;

            }

        }

        // int max =0;

     Arrays.sort(value);
     


        // for(int i=0;i<arr.length;i++){
        //     if(value[i]>max){
        //         max = value[i];
        //     }
        // }

        System.out.println(value[value.length-1]);

    }



    public static void main(String[] args){

            String ap = "Java";
            find(ap);
    
    }

}