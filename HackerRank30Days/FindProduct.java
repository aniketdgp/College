import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
  
        
        Scanner sc = new Scanner(System.in);
        int n;
        long answer=1;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            answer=(answer*arr[i])%(1000000007);
        }
        
        System.out.println(answer);
        
    }
}
