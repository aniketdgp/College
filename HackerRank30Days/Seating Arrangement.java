import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n,i,j;
    n=sc.nextInt();
    int[] arr=new int[n];
    
    int[] wsd = {1,12,13,24,25,36,37,48,49,60,61,72,73,84,85,96,97,108 };
    int[] msd = {2,11,14,23,26,35,38,47,50,59,62,71,74,83,86,95,98,107 };
    int[] asd = {3,10,15,22,27,34,39,46,51,58,63,70,75,82,87,94,99,106,};
    int[] asu = {4,9,16,21,28,33,40,45,52,57,64,69,76,81,88,93,100,105 };
    int[] msu = {5,8,17,20,29,32,41,44,53,56,65,68,77,80,89,92,101,104 };
    int[] wsu = {6,7,18,19,30,31,42,43,54,55,66,67,78,79,90,91,102,103 };

    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }        
    
    for(i=0;i<n;i++){
      for(j=0;j<wsd.length;j++){
          if(arr[i]==wsd[j]){
              System.out.println(arr[i]+11+" "+"WS");
          }
          else if(arr[i]==msd[j]){
              System.out.println(arr[i]+9+" "+"MS");
          }
           else if(arr[i]==asd[j]){
              System.out.println(arr[i]+7+" "+"AS");
          }
          else if(arr[i]==asu[j]){
              System.out.println(arr[i]+5+" "+"AS");
          }
           else if(arr[i]==msu[j]){
              System.out.println(arr[i]+3+" "+"MS");
          }
          else if(arr[i]==wsu[j]){
              System.out.println(arr[i]+1+" "+"WS");
          }
          
          
      }
    }
    
    }
}
