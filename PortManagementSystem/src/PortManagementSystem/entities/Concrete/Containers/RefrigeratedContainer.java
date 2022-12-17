package PortManagementSystem.entities.Concrete.Containers;

public class RefrigeratedContainer extends HeavyContainer {
    public RefrigeratedContainer(int ID,int PortID, int weight) {
        super(ID,PortID, weight);
    }

    public double consumption()
    {
        return 5.00 * this.getWeight();
    }
}
