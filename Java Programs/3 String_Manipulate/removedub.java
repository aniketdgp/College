import java.util.*;

class aniket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = arr.length,i,j;
       
        for(i=0;i<len;i++){
          
            for(j=i+1;j<len;j++){

                if(arr[i]==arr[j]){
                    arr[j]='?';
                }

            }
        }

        for(i=0;i<len;i++){

            if(arr[i]!='?'){
               System.out.print(arr[i]);
            }
            

        }
       
       
        
    }

}