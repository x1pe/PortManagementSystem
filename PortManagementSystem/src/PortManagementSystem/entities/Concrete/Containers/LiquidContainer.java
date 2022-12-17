package PortManagementSystem.entities.Concrete.Containers;

public class LiquidContainer extends HeavyContainer {
    public LiquidContainer(int ID,int PortID, int weight) {
        super(ID,PortID, weight);
    }
    public double consumption()
    {
        return 4.00 * this.getWeight();
    }


}
