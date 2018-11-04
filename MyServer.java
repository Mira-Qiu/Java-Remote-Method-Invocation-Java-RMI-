import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;

public class MyServer {
    public static void main(String args[]){
        try{
            int port = 16790;
            VoteServerImpl exportedObj = new VoteServerImpl();
            LocateRegistry.createRegistry(port);
            String registryURL = "rmi://localhost:"+port+"/charlie";
            Naming.rebind(registryURL, exportedObj);
            System.out.println("Server ready");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
