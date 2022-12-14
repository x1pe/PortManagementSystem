package PortManagementSystem.entities.Concrete;

import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IShip;

import java.util.ArrayList;


public class Ship implements IShip {


    int ID;

    double fuel;

    Port currentPort;
    int portID;

    private final String shipName;
    private final int totalWeightCapacity;
    private final int maxNumberOfAllContainers;
    private final int maxNumberOfHeavyContainers;
    private final int maxNumberOfRefrigeratedContainers;
    private final int maxNumberOfLiquidContainers;
    private double fuelConsumptionPerKM;

    ArrayList<Container> CurrentContainers;



    public Ship(String shipName,
                int portID,
                Port p,
                int totalWeightCapacity,
                int maxNumberOfAllContainers,
                int maxNumberOfHeavyContainers,
                int maxNumberOfRefrigeratedContainers,
                int maxNumberOfLiquidContainers,
                double fuelConsumptionPerKM) {
        this.shipName = shipName;
        this.portID = portID;
        this.currentPort = p;
        this.totalWeightCapacity = totalWeightCapacity;
        this.maxNumberOfAllContainers = maxNumberOfAllContainers;
        this.maxNumberOfHeavyContainers = maxNumberOfHeavyContainers;
        this.maxNumberOfRefrigeratedContainers = maxNumberOfRefrigeratedContainers;
        this.maxNumberOfLiquidContainers = maxNumberOfLiquidContainers;
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

    public int getMaxNumberOfAllContainers() {
        return maxNumberOfAllContainers;
    }

    public int getMaxNumberOfHeavyContainers() {
        return maxNumberOfHeavyContainers;
    }

    public int getMaxNumberOfRefrigeratedContainers() {
        return maxNumberOfRefrigeratedContainers;
    }

    public int getMaxNumberOfLiquidContainers() {
        return maxNumberOfLiquidContainers;
    }

    public int getTotalWeightCapacity() {
        return totalWeightCapacity;
    }

    public String getShipName() {
        return shipName;
    }

    public double getFuelConsumptionPerKM() {
        return fuelConsumptionPerKM;
    }
}
