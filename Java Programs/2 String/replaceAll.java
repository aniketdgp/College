import java.io.*;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
class Main {

   public static void main(String args[]) {
      String Str = new String("Aniket Prasad is a good boy");

      System.out.print("Return Value :" );
      System.out.println(Str.replaceAll("(.*)Prasad(.*)","Gupta"));
      System.out.println(Str);

   }
}