import java.util.Scanner;


class Aniket{

int Aniket(final int r, final int c){
return r*c;
}

}

class Ruby{

    public static void main(final String[] args) {
    

        final Scanner sc = new Scanner(System.in);

        final Aniket s1 = new Aniket();
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        System.out.println(s1.Aniket(a, b));

        sc.close();


    }


}