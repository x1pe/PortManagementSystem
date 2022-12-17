package PortManagementSystem.Core.primaryKeyAssigners;

public class PortKeyAssigner {

    static int id;

    public static int assign()
    {
        id++;
        return id;
    }
}
