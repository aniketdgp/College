import java.io.*;
class Main {

   public static void main(String args[]) {
      String str = new String("Aniket Prasad");

        String arr[] = str.split("");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


   }
}