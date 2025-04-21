package bca.sudeep.clientmain;

import bca.sudeep.rmi.Message;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    public ClientMain() throws RemoteException, NotBoundException {
        Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        Message impl = (Message) myRegistry.lookup("myMessage");
        String s = impl.sayHello("Sudeep Pudasaini");
        double d = impl.saySqrt(9);
        int fact = impl.findFactorial(6);
        System.out.println("Message sent and response received");
        System.out.println(s + "\n" + d + "\n" + fact);
    }

    public  static  void main(String[] args) throws NotBoundException, RemoteException {
        new ClientMain();
    }
}
