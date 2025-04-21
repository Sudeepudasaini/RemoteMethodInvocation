package bca.sudeep.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
    public abstract String sayHello(String message) throws RemoteException;
    public abstract double saySqrt(double num) throws RemoteException;
    public  abstract int findFactorial(int num) throws RemoteException;
}
