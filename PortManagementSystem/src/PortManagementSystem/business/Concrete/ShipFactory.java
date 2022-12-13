package PortManagementSystem.business.Concrete;

import PortManagementSystem.business.Abstract.IShipService;
import PortManagementSystem.entities.Concrete.Port;
import PortManagementSystem.entities.Concrete.Ship;

public class ShipFactory implements IShipService {


    //TODO BUSINESS CODES OF ShipBuilder, constraints and nonzero values
    public static void ShipBuilder(String shipName,
                                   int PortID,
                                   Port p,
                                   int totalWeightCapacity,
                                   int maxNumberOfAllContainers,
                                   int maxNumberOfHeavyContainers,
                                   int maxNumberOfRefrigeratedContainers,
                                   double fuelConsumptionPerKM)
    {
        new Ship(shipName,PortID,p,totalWeightCapacity,maxNumberOfAllContainers,maxNumberOfHeavyContainers,
                maxNumberOfRefrigeratedContainers,fuelConsumptionPerKM);
    }
}
