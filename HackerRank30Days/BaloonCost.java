//Wrong Solution

import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n ; // number of testcase
        int gc,pc; //cost of baloons
        int ns; //number of students
        int tc=0; //total cost
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            gc=sc.nextInt();
            pc=sc.nextInt();
            ns=sc.nextInt();
            int q1[]=new int[ns];//student responses
            int q2[]=new int[ns];//student responses
            for(int k=0;k<ns;k++){
                q1[k]=sc.nextInt();
                q2[k]=sc.nextInt();
                tc=q1[k]+q2[k]+tc;
            }
               System.out.println(tc);
            
        }
   

    }
}
