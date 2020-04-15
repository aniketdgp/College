import java.util.*;

class aniket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();

        int len=arr.length,i;
        int max=0;
        int index=0;
        for(i=0;i<len;i++){
            int count=0;
            int j;
            for(j=0;j<len;j++){
             
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }
            if(count>max){
                max = count;
                index = i; 
            }

        }
       


        System.out.println(arr[index]);


    }

}