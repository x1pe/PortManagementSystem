package PortManagementSystem.ConsoleUI;

import java.util.Scanner;

public class Main {
    public static void main(String args) {

        Scanner s = new Scanner(System.in);
        int menuvar;

        printMenu();


        menuvar = s.nextInt();

        if (menuvar==1)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("************Create Container*****************");
            System.out.println("");
            System.out.println("YOU need to Select A Port To Create Container:");
            System.out.println("    Your Available Ports:");
            System.out.println("");

            //TODO SHOW ALL PORTS AND COORDINATES, AVAILABLE INFO
        }
        else if (menuvar==2)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("*****************Create Ship*****************");
            System.out.println("");
            System.out.println("YOU need to Select A Port To Create Ship:");
            System.out.println("");
            System.out.println("    Your Available Ports:");
            System.out.println("");


        }
        else if (menuvar==3)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("*****************Create Port*****************");
            System.out.println("");
            System.out.println("YOU need to Give X/Y Location to create new port:");
            System.out.println("");
            System.out.println("Type X");
            System.out.println("Type Y");
        }
        else if (menuvar==4)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("**************Load A Container***************");
            System.out.println("");

        }
        else if (menuvar==5)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("**************Unload A Container*************");


        }
        else if (menuvar==6)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
        }
        else if (menuvar==7)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");
        }
        else
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("*********************************************");

            System.out.println("Invalid input.");

            System.out.println("*********************************************");

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

    public static void printMenu()
    {
        System.out.println("*********************************************");
        System.out.println("1-) Create a container.");
        System.out.println("2-) Create a ship.");
        System.out.println("3-) Create a port.");
        System.out.println("4-) Load a container to a ship.");
        System.out.println("5-) Unload a container from a ship.");
        System.out.println("6-) Send ship to another port.");
        System.out.println("7-) Refuel ship.");
        System.out.println("*********************************************");
    }
}
