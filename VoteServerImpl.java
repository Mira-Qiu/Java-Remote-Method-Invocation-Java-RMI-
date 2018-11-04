import java.rmi.*;
import java.rmi.server.*;

public class VoteServerImpl extends UnicastRemoteObject implements  VoteInterface {
    int yes = 0;
    int no = 0;
    protected VoteServerImpl() throws RemoteException {
        super();
    }
    @Override
    public String castVote(char vote) throws RemoteException {
        switch (vote){
            case 'y':
                yes++;
                break;
            case 'n':
                no++;
                break;
            default:System.out.println("Enter error");
        }
        return "Yes = "+yes+"; No = "+no;
    }
}
