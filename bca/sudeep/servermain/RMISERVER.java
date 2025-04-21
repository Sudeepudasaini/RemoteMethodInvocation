package bca.sudeep.servermain;


import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import bca.sudeep.rmi.Mathservice1;
import bca.sudeep.rmi.Mathserviceimplementation;

public class RMISERVER {
    public static void main(String[] args) throws RemoteException,AlreadyBoundException, java.rmi.AlreadyBoundException{
    	
        try {
        	Mathservice1 service = new Mathserviceimplementation();
            Registry registry = LocateRegistry.createRegistry(1099); // RMI port
            registry.rebind("Mathservice", service);
            System.out.println("Sudeep,MathService is bound to RMI Registry.");
        } catch (Exception e) {
            System.err.println(" Server error: " + e);
        }
    }
}