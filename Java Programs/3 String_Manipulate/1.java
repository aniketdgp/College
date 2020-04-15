import java.util.*;

class Test {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //int[] arr = new int[n];
        int min=1000,j,k;
        
        for(j=0;j<n;j++){
            
            k = sc.nextInt();
            if(k%7==0 && k<min){
                min = k;
            }
            
        }
        
        System.out.println(min);
    
        
        
    
      
      
    }
}
