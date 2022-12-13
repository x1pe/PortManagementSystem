package PortManagementSystem.entities.Abstract;

public abstract class Container {

    private int ID;
    private int weight;
    public Container(int ID, int weight) {
        this.ID = ID;
        this.weight = weight;
    }

    double consumption() {
        return 0;  // TODO should return fuel consumption required by the container
    }


    boolean equals(Container other) {
        return false;  // TODO  check type, ID and weight of a container.
                        // If they are the same, return true, otherwise return false.
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
