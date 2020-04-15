import java.util.*;

class aniket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=n;

        int sum=0;

        while(n>0){

            int k = n%10;
            sum = 10*sum+k;
            n = n/10;

        }

        if(j==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

}