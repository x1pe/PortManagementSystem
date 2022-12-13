package PortManagementSystem.entities.Abstract;

public abstract class Container {

    private int ID;
    private int weight;
    public Container(int ID, int weight) {
        this.ID = ID;
        this.weight = weight;
    }

    double consumption(Container container) {
        return 0;
    }


    boolean equals(Container other) {
         // TODO  check type, ID and weight of a container.
                        // If they are the same, return true, otherwise return false.
        if(this.getID() == other.getID() &&
                this.getWeight() == other.getWeight() &&
                this.getClass().equals(other.getClass())){
            return true;
        }
        else
            return false;
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
