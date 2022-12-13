package PortManagementSystem.entities.Concrete;

import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IShip;

import java.util.ArrayList;
import java.util.List;

public class Ship implements IShip {


    int ID;

    double fuel;

    Port currentPort;
    int portID;

    String shipName;
    int totalWeightCapacity;
    int maxNumberOfAllContainers;
    int maxNumberOfHeavyContainers;
    int maxNumberOfRefrigeratedContainers;
    double fuelConsumptionPerKM;

    ArrayList<Container> CurrentContainers;



    public Ship(String shipName,
                int portID,
                Port p,
                int totalWeightCapacity,
                int maxNumberOfAllContainers,
                int maxNumberOfHeavyContainers,
                int maxNumberOfRefrigeratedContainers,
                double fuelConsumptionPerKM) {
        this.shipName = shipName;
        this.portID = portID;
        this.currentPort = p;
        this.totalWeightCapacity = totalWeightCapacity;
        this.maxNumberOfAllContainers = maxNumberOfAllContainers;
        this.maxNumberOfHeavyContainers = maxNumberOfHeavyContainers;
        this.maxNumberOfRefrigeratedContainers = maxNumberOfRefrigeratedContainers;
        this.fuelConsumptionPerKM = fuelConsumptionPerKM;
    }

    ArrayList<Container> getCurrentContainers()
    {
        // TODO
        return null;
    }

    @Override
    public boolean sailTo(Port p) {
        return false;
    }

    @Override
    public void reFuel(double newFuel) {

    }

    @Override
    public boolean load(Container cont) {
        return false;
    }

    @Override
    public boolean unLoad(Container cont) {
        return false;
    }
}
