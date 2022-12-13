package PortManagementSystem.entities.Concrete.Containers;

import PortManagementSystem.entities.Abstract.Container;

public class BasicContainer extends Container {
    public BasicContainer(int ID, int weight) {
        super(ID, weight);
    }

    public double consumption()
    {
        return 2.50 * this.getWeight();
    }

}
