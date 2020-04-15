import java.util.*;

class aniket{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();

        ArrayList<Character> charlist = new ArrayList<Character>();

        for(char ch : arr){
            if(!charlist.contains(ch)){
                charlist.add(ch);
            }
        }

        StringBuffer cb = new StringBuffer();

        for(char c : charlist){

            cb.append(c);

        }

        System.out.println(cb);

    }

}