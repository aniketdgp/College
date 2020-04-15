import java.util.*;

class aniket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();

        Set<Character> charset = new LinkedHashSet<Character>();

        for(char ch : arr){

            charset.add(ch);

        }


        StringBuffer ab = new StringBuffer();

        for(char c : charset){
            ab.append(c);
        }

        System.out.println(ab);



    }

}