import java.nio.charset.Charset;
import java.util.*;

class aniket{

      public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            char[] arr = s.toCharArray();

            Set<Character> charSet = new LinkedHashSet<Character>();

            for(char ch : arr){
                  charSet.add(ch);
            }

            StringBuffer cb = new StringBuffer();

            for(char c : charSet){
                  cb.append(c);
            }

            System.out.println(cb);


      


      }

}