package bca.sudeep.rmi;



import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Mathserviceimplementation extends UnicastRemoteObject implements Mathservice1 {

    public Mathserviceimplementation() throws RemoteException {
        super();
    }

    public double areaOfCircle(double radius) throws RemoteException {
        return Math.PI * radius * radius;
    }

    public String findEvenOdd(int number) throws RemoteException {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}