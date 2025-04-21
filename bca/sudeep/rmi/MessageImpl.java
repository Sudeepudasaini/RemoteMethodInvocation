package bca.sudeep.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message{
    public MessageImpl() throws RemoteException {

    }

    @Override
    public String sayHello(String message) {
        return "My message is " + message;
    }

    @Override
    public double saySqrt(double num) {
        return Math.sqrt(num);
    }

    @Override
    public int findFactorial(int num) {
        if(num ==0 || num ==1) return 1; //base condition is mandatory in recursive function

        return num * findFactorial(num - 1);
    }
}