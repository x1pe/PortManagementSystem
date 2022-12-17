package PortManagementSystem.Core.primaryKeyAssigners;

public class ContainerKeyAssigner {
    static int id;

    public static int assign()
    {
        id++;
        return id;
    }
}
