package PortManagementSystem.entities.Concrete;

import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IShip;

import java.util.ArrayList;
import java.util.List;

public class Ship implements IShip {


    public Ship(int ID, Port p, int totalWeightCapacity,
                int
            maxNumberOfAllContainers,
                int maxNumberOfHeavyContainers,
                int maxNumberOfRefrigeratedContainers,
                int maxNumberOfLiquidContainers,
                double fuelConsumptionPerKM)

    {

    }

    ArrayList<Container> getCurrentContainers()
    {
        // TODO
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
