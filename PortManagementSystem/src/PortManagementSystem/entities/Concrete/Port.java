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

    @Override
    public void incomingShip(Ship s) {

    }

    @Override
    public void outgoingShip(Ship s) {

    }

    double getDistance(Port other)
    {
        // TODO calculates the distance between the object itself and another Port
        return 0;
    }
}
