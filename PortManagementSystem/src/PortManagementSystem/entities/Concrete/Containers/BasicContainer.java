package PortManagementSystem.entities.Concrete.Containers;

import PortManagementSystem.entities.Abstract.Container;

public class BasicContainer extends Container {
    public BasicContainer(int ID,int PortID,int weight) {
        super(ID,PortID,weight);

    }

    public double consumption()
    {
        return 2.50 * this.getWeight();
    }

}
