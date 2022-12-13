package PortManagementSystem.entities.Concrete.Containers;

public class RefrigeratedContainer extends HeavyContainer {
    public RefrigeratedContainer(int ID, int weight) {
        super(ID, weight);
    }

    public double consumption()
    {
        return 5.00 * this.getWeight();
    }
}
