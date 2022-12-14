package PortManagementSystem.business.Concrete;

import PortManagementSystem.business.Abstract.IPortService;
import PortManagementSystem.entities.Concrete.Port;

public class PortFactory implements IPortService {

    private static boolean Build = true;

    public static boolean isBuild() {
        return Build;
    }

    public static void setBuild(boolean build) {
        Build = build;
    }

    public static void PortBuilder(String portName,double x, double y)
    {
        //TODO cant build ports too close to each other
        new Port(portName,x,y);
    }
}
