package PortManagementSystem.Core.primaryKeyAssigners;

public class ShipKeyAssigner {
    static int id;

    public static int assign()
    {
        id++;
        return id;
    }
}
