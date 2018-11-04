import java.rmi.*;
import java.util.*;

public class MyClient {
     public static void main(String args[]){
          try{
               int port = 16790;
               String registryURL ="rmi://localhost:"+port+"/charlie";
               VoteInterface v = (VoteInterface)Naming.lookup(registryURL);
               Scanner keyboard = new Scanner(System.in);
               while(true){
                    System.out.print("What is your vote? [yes|no]: ");
                    String str = keyboard.nextLine();
                    char c = str.charAt(0);
                    System.out.println(v.castVote(c));
               }

          }catch (Exception e){
               e.printStackTrace();
          }

     }
}
