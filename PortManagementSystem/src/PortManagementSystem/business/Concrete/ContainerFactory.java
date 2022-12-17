package PortManagementSystem.business.Concrete;

import PortManagementSystem.Core.Exceptions.InvalidTypeException;
import PortManagementSystem.Core.primaryKeyAssigners.ContainerKeyAssigner;
import PortManagementSystem.business.Abstract.IContainerService;
import PortManagementSystem.entities.Abstract.Container;
import PortManagementSystem.entities.Concrete.Containers.BasicContainer;
import PortManagementSystem.entities.Concrete.Containers.HeavyContainer;
import PortManagementSystem.entities.Concrete.Containers.LiquidContainer;
import PortManagementSystem.entities.Concrete.Containers.RefrigeratedContainer;

import java.util.HashMap;

public class ContainerFactory implements IContainerService {

    public static HashMap<int, Container> ContainerMap = new HashMap<int, Container>();



    public void ContainerBuilder(int PortID, int weight, char type) throws InvalidTypeException {
        if(weight<=3000)
        {
            System.out.println("You can't choose R/L type for Basic Containers");
        }
        else if(weight>3000)
        {
            if (type == 'R')
            {
                int key = ContainerKeyAssigner.assign();
                ContainerMap.put(key,new RefrigeratedContainer(key,PortID, weight));

            }
            else if (type == 'L')
            {
                int key = ContainerKeyAssigner.assign();
                ContainerMap.put(key,new LiquidContainer(key,PortID, weight));

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
            int key = ContainerKeyAssigner.assign();
            ContainerMap.put(key, new BasicContainer(key,PortID,weight));
        }
        else
        {
            int key = ContainerKeyAssigner.assign();
            ContainerMap.put(key,new HeavyContainer(key,PortID, weight));
        }
    }
}
