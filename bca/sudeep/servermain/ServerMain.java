package bca.sudeep.servermain;

import bca.sudeep.rmi.MessageImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
    public ServerMain() throws RemoteException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("myMessage", new MessageImpl());
        System.out.println(" Sudeep Server is running");
    }

    public static void main(String[] args) throws AlreadyBoundException, RemoteException {
        new ServerMain();
    }
}
