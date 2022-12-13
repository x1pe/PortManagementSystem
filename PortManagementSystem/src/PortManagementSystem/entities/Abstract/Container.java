package PortManagementSystem.entities.Abstract;

import PortManagementSystem.entities.Concrete.Containers.BasicContainer;
import PortManagementSystem.entities.Concrete.Containers.RefrigeratedContainer;

public abstract class Container {

    private int ID;
    private int weight;
    public Container(int ID, int weight) {
        this.ID = ID;
        this.weight = weight;
    }



    private double consumption() {
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



    public int getWeight() {
        return weight;
    }




}
