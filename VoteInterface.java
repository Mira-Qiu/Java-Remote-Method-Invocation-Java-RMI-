import java.rmi.Remote;

public interface VoteInterface extends Remote{
    public String castVote(char vote) throws java.rmi.RemoteException;
}
