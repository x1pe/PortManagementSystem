package PortManagementSystem.entities.Concrete.Containers;

import PortManagementSystem.entities.Abstract.Container;

public class HeavyContainer extends Container {
    public HeavyContainer(int ID, int weight) {
        super(ID, weight);
    }

    private double consumption()
    {
        return 3.00 * this.getWeight();
    }
}
