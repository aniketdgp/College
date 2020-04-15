import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc= new Scanner(System.in);
    
    String s,p,k="";
    int counter=0;
    s=sc.next();
    
    String[] arr = s.split("");
    String[] parr= new String[arr.length];
    int n=arr.length-1;
    
    for(int i=0;i<arr.length;i++){
      parr[i]=arr[n];
      n--;
    }

    for(int i =0;i<arr.length;i++){
        k=k+parr[i];
    }


if(k.equals(s)==true){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}



    }
}
