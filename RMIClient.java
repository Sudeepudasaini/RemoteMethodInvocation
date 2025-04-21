package bca.sudeep.clientmain;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import bca.sudeep.rmi.Mathservice1;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Mathservice1 service = (Mathservice1) registry.lookup("Mathservice");

            double area = service.areaOfCircle(7.0);
            String check = service.findEvenOdd(13);

            System.out.println(" Sudeep,Area of circle (r=7): " + area);
            System.out.println("  Sudeep Number 13 is: " + check);
        } catch (Exception e) {
            System.err.println(" Client error: " + e);
        }
    }
}