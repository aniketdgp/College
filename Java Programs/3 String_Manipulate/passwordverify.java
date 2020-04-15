import java.util.*;

class Check{

String sp;

    void result(String s){
            
        sp = s;
        int l = sp.length();
        int i;
        int strlen=0;
        int num =0;
        int spclchar=0;

        char arr[] = sp.toCharArray();

        for(i=0;i<l;i++){
        
            int v = arr[i];
            if(v>64 && v<91 || v>96 && v<123){
                strlen++;
            }
        
        }

        for(i=0;i<l;i++){

            int v = arr[i];
            if(v>47 && v<58){
                num++;
            }

        }

        for(i=0;i<l;i++){

            int v = arr[i];

            if(v>32&&v<48||v>57&&v<65||v>90&&v<97||v>122&&v<127){
                spclchar++;
            }

        }

        // System.out.println(strlen);
        // System.out.println(num);
        // System.out.println(spclchar);

       

     if(l>=10 && strlen>0){
         if(num>1){
            if(spclchar>0){
                System.out.println("InValid Password");
            }
            else{
                System.out.println("Valid Password");
            }
         }
         else{
            System.out.println("Invalid Password");
         }
     }
     else{
        System.out.println("In-Valid Password");
     }
        
        


    }


}





class Aniket{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Check st = new Check();
        st.result(s);

    }


}
