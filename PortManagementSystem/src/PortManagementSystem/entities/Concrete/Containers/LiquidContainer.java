package PortManagementSystem.entities.Concrete.Containers;

public class LiquidContainer extends HeavyContainer {
    public LiquidContainer(int ID, int weight) {
        super(ID, weight);
    }
    private double consumption()
    {
        return 4.00 * this.getWeight();
    }
}
