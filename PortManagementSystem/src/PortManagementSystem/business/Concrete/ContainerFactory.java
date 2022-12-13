package PortManagementSystem.business.Concrete;

import PortManagementSystem.Core.Exceptions.InvalidTypeException;
import PortManagementSystem.business.Abstract.IContainerService;
import PortManagementSystem.entities.Concrete.Containers.BasicContainer;
import PortManagementSystem.entities.Concrete.Containers.HeavyContainer;
import PortManagementSystem.entities.Concrete.Containers.LiquidContainer;
import PortManagementSystem.entities.Concrete.Containers.RefrigeratedContainer;

public class ContainerFactory implements IContainerService {
    public void ContainerBuilder(int PortID, int weight, char type) throws InvalidTypeException {
        if(weight<=3000)
        {
            System.out.println("You can't choose R/L type for Basic Containers");
        }
        else if(weight>3000)
        {
            if (type == 'R')
            {
                new RefrigeratedContainer(PortID, weight);
            }
            else if (type == 'L')
            {
                new LiquidContainer(PortID, weight);
            }
            else
            {
                throw new InvalidTypeException("Invalid Container Type: R or L Required");
            }


        }
    }
    public void ContainerBuilder(int PortID, int weight) throws InvalidTypeException {
        if(weight<=3000)
        {
            new BasicContainer(PortID,weight);
        }
        else
        {
            new HeavyContainer(PortID, weight);
        }
    }
}
