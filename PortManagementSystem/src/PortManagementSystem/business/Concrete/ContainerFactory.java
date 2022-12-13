package PortManagementSystem.business.Concrete;

import PortManagementSystem.business.Abstract.IContainerService;
import PortManagementSystem.entities.Concrete.Containers.BasicContainer;
import PortManagementSystem.entities.Concrete.Containers.LiquidContainer;
import PortManagementSystem.entities.Concrete.Containers.RefrigeratedContainer;

public class ContainerFactory implements IContainerService {
    public void BuildBox(int PortID, int weight, char type)
    {
        if(weight<=3000)
        {
            new BasicContainer(PortID, weight);
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

        }
    }
}
