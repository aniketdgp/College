import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {

    Scanner sc = new Scanner(System.in);
    String s;
    s=sc.next();
    char[] arr = s.toCharArray();
    int x=0,y=0;
    
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]=='L'){
            x=x-1;
        }
        else if(arr[i]=='R'){
            x=x+1;
        }
        else if(arr[i]=='U'){
            y=y+1;
        }
        else if(arr[i]=='D'){
            y=y-1;
        }
    }
    
    System.out.print(x+" "+y);
    }
}
