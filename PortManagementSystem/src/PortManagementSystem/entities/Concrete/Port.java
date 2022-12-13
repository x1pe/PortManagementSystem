package PortManagementSystem.entities.Concrete;

import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IPort;


import java.util.ArrayList;

public class Port implements IPort {



    private int ID;
    private double X;
    private double Y;

    ArrayList<Container> containers;

    ArrayList<Ship> history;

    ArrayList<Ship> current;


    public Port(String PortName,double x, double y) {
        this.X = x;
        this.Y = y;
        ID=0; //TODO Auto incremented id
    }

    @Override
    public void incomingShip(Ship s) {

    }

    @Override
    public void outgoingShip(Ship s) {

    }

    double getDistance(Port other)
    {
        // TODO calculates the distance between the object itself and another Port
        double getRootsquare = (this.X - other.X)*(this.X - other.X) + (this.Y - other.Y) * (this.Y - other.Y);
        return Math.pow(getRootsquare, 1/2);
    }
}
