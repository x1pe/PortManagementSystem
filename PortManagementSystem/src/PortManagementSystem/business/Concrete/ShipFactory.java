package PortManagementSystem.business.Concrete;

import PortManagementSystem.Core.primaryKeyAssigners.ShipKeyAssigner;
import PortManagementSystem.business.Abstract.IShipService;
import PortManagementSystem.entities.Concrete.Port;
import PortManagementSystem.entities.Concrete.Ship;

import java.util.HashMap;

public class ShipFactory implements IShipService {

    public static HashMap<Integer, Ship> ShipMap = new HashMap<Integer, Ship>();
    private static boolean Build = true;

    public static boolean isBuild() {
        return Build;
    }

    public static void setBuild(boolean build) {
        Build = build;
    }

    //TODO BUSINESS CODES OF ShipBuilder, constraints and nonzero values
    public static void ShipBuilder(String shipName,
                                   int PortID,
                                   Port p,
                                   int totalWeightCapacity,
                                   int maxNumberOfAllContainers,
                                   int maxNumberOfHeavyContainers,
                                   int maxNumberOfRefrigeratedContainers,
                                   int maxNumberOfLiquidContainers,
                                   double fuelConsumptionPerKM)
    {
        if(maxNumberOfAllContainers<= 0)
        {
            System.out.println("Invalid Format. Container capacity should be non-zero positive integer.");
            setBuild(false);
        }
        if(maxNumberOfHeavyContainers<0)
        {
            System.out.println("Invalid Format.Heavy Container capacity should be positive integer.");
            setBuild(false);
        }
        if(maxNumberOfRefrigeratedContainers<0)
        {
            System.out.println("Invalid Format.Refrigerated Container capacity should be positive integer.");
            setBuild(false);
        }
        if(maxNumberOfLiquidContainers<0)
        {
            System.out.println("Invalid Format.Liquid Container capacity should be positive integer.");
            setBuild(false);
        }

        if(isBuild())
        {
            int key = ShipKeyAssigner.assign();
            ShipMap.put(key,new Ship(key,shipName,PortID,p,totalWeightCapacity,maxNumberOfAllContainers,maxNumberOfHeavyContainers,
                    maxNumberOfRefrigeratedContainers,maxNumberOfLiquidContainers,fuelConsumptionPerKM));

        }

    }
}
