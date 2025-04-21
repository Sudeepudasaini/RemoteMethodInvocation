package bca.sudeep.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mathservice1 extends Remote {
    double areaOfCircle(double radius) throws RemoteException;
    String findEvenOdd(int number) throws RemoteException;
	
}