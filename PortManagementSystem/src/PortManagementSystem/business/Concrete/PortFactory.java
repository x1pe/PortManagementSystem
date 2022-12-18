package PortManagementSystem.business.Concrete;

import PortManagementSystem.Core.primaryKeyAssigners.PortKeyAssigner;
import PortManagementSystem.business.Abstract.IPortService;
import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Concrete.Port;

import java.util.HashMap;

public class PortFactory implements IPortService {

    public static HashMap<Integer, Port> PortMap = new HashMap<Integer, Port>();
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
        int key = PortKeyAssigner.assign();
        PortMap.put(key,new Port(key,portName,x,y));

    }
}
