import java.util.*;

class aniket{

    public static void main(String[] args){

        //String s = "hi hello hello aniket aniket anik";
        //String arr[] = s.split(" ");

        String a = "aaabbvvs";
        char arr[] = a.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==(arr[j])){   // for string   if(arr[i].equals(arr[j])){ 
                    arr[j]='d';         // for string arr[j]="d";
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='d'){                   // for string if(arr[i]!="d"){     
                System.out.print(arr[i]+" ");
            }
        }



    }
}
