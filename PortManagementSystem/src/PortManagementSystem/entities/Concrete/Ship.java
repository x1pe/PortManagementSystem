package PortManagementSystem.entities.Concrete;

import PortManagementSystem.Core.primaryKeyAssigners.ShipKeyAssigner;
import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Abstract.IShip;

import java.util.ArrayList;


public class Ship implements IShip {


    private final int ID;

    private double fuel;

    private Port currentPort;
    private  int portID;

    private final String shipName;
    private final int totalWeightCapacity;
    private final int maxNumberOfAllContainers;
    private final int maxNumberOfHeavyContainers;
    private final int maxNumberOfRefrigeratedContainers;
    private final int maxNumberOfLiquidContainers;
    private double fuelConsumptionPerKM;

    ArrayList<Container> CurrentContainers;



    public Ship(int ID,
                String shipName,
                int portID,
                Port p,
                int totalWeightCapacity,
                int maxNumberOfAllContainers,
                int maxNumberOfHeavyContainers,
                int maxNumberOfRefrigeratedContainers,
                int maxNumberOfLiquidContainers,
                double fuelConsumptionPerKM)
    {
        this.ID = ID;
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



    @Override
    public boolean sailTo(Port p) {
        return false;
    }
        //TODO
    @Override
    public void reFuel(double newFuel) {

    }

    @Override
    public boolean load(Container cont) {
        return false;
    }
        //TODO
    @Override
    public boolean unLoad(Container cont) {
        return false;
    }
        //TODO


    public ArrayList<Container> getCurrentContainers() {
        return CurrentContainers;
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
