import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();//row
        int n=sc.nextInt();//col
        int rank=1;
        int[] nar = new int[m*n];
        int[] rankar = new int[m*n];
        int r=1;
        int l=0;
     
 
        int[][] arr =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }

   

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             
             nar[l] =arr[i][j];
             l++;

            }
            
        }
        Arrays.sort(nar);
        int zo=0;

        for(int i=0;i<nar.length;i++){
          
          while(i<nar.length-1 && nar[i]==nar[i+1]){
              i++;
          }
          
          rankar[zo]=nar[i];
          zo++;
         

        }

        System.out.println(" ");
          System.out.println(" ");
           System.out.println(" ");
int j,i;

        int[][] larr =new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                
                int ko =arr[i][j];
               for(int lo=0;lo<zo;lo++){

                 if(ko==rankar[lo]){
                   larr[i][j]=lo+1;
                 } 
                  
                  
                   
               }
               
                
                    System.out.print(larr[i][j]);
                 
              
               }
                System.out.println("");
              
            }
            
        

        



       

    }
}
