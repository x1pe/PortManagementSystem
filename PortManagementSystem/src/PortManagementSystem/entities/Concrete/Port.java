package PortManagementSystem.entities.Concrete;

import PortManagementSystem.Core.primaryKeyAssigners.PortKeyAssigner;
import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IPort;


import java.util.ArrayList;

public class Port implements IPort {


    private final String portName;

    private int ID;
    private double X;
    private double Y;

    ArrayList<Container> containers;

    ArrayList<Ship> history;

    ArrayList<Ship> current;


    public Port(int ID,String portName,double x, double y) {
        this.portName = portName;
        this.X = x;
        this.Y = y;
        this.ID = ID;

    }

    @Override
    public void incomingShip(Ship s) {
        current.add(s);
    }

    @Override
    public void outgoingShip(Ship s) {
        history.add(s);
    }

    double getDistance(Port other)
    {
        // TODO calculates the distance between the object itself and another Port
        double getRootsquare = (this.X - other.X)*(this.X - other.X) + (this.Y - other.Y) * (this.Y - other.Y);
        return Math.pow(getRootsquare, 1/2);
    }
}
