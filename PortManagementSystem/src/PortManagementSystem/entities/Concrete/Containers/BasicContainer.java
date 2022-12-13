package PortManagementSystem.entities.Concrete.Containers;

import PortManagementSystem.entities.Abstract.Container;

public class BasicContainer extends Container {
    public BasicContainer(int ID, int weight) {
        super(ID, weight);
    }

    private double consumption()
    {
        return 2.50 * this.getWeight();
    }

}
