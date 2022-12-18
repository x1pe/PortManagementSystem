package PortManagementSystem.ConsoleUI;

import PortManagementSystem.Core.Exceptions.InvalidTypeException;
import PortManagementSystem.business.Concrete.ContainerFactory;

import java.util.Scanner;

import static PortManagementSystem.business.Concrete.PortFactory.PortMap;

public class Main {
    public static void main(String[] args) throws InvalidTypeException {

        Scanner s = new Scanner(System.in);
        int menuvar;

        printMenu();

        int program = 0;
        menuvar = s.nextInt();

        while(program==0)
        {
            if (menuvar==1)
            {
                int PortID;
                int weight;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("*********************************************");
                System.out.println("************Create Container*****************");
                System.out.println();
                System.out.println("YOU need to Select A Port To Create Container:");
                System.out.println("    Your Available Ports:");
                showAwailablePorts();
                System.out.println("*********************************************");
                System.out.println();
                System.out.println("Please provide a port ID");
                if(s.hasNextInt())
                {
                    PortID = s.nextInt();
                }
                else
                {
                    System.out.println("Invalid output. Please provide an integer");
                    break;
                }
                System.out.println("*********************************************");
                System.out.println("");
                System.out.println("Enter the weight of the Container");
                if(s.hasNextInt())
                {
                    weight = s.nextInt();
                }
                else
                {
                    System.out.println("Invalid output. Please provide an integer");
                    break;
                }
                System.out.println("*********************************************");
                System.out.println();
                System.out.println("Enter a character to define type of the container ");
                System.out.println("R=>Refrigerated Container");
                System.out.println("L=>Liquid Container");
                System.out.println("D=>Default");
                //


                Character type = s.next().charAt(0);
                if(type.equals('R') || type.equals('D') || type.equals('L') )
                {
                    type = s.next().charAt(0);
                }
                else
                {

                    System.out.println("Invalid output. Please provide an integer");
                    break;
                }

                if(type.equals('D'))
                {
                    ContainerFactory.ContainerBuilder(PortID,weight);
                    System.out.println("Container successfully built");
                    System.out.println("*********************************************");
                    System.out.println();
                    System.out.println();
                    //TODO WRITE CURRENT 
                }
                else
                {
                    ContainerFactory.ContainerBuilder(PortID,weight,type);
                }


                //TODO SHOW ALL PORTS AND COORDINATES, AVAILABLE INFO
            }
            else if (menuvar==2)
            {
                System.out.println();
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
                System.out.println("*********************************************");
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
                System.out.println("*********************************************");
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
                System.out.println("*********************************************");



            }
            else if (menuvar==6)
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("************Sailing to Another Port**********");
                System.out.println("*********************************************");


            }
            else if (menuvar==7)
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*******************Refueling*****************");
                System.out.println("*********************************************");


            }

            else if (menuvar==8)
            {
                program = 1;
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

    }

    private static void showAwailablePorts() {
        System.out.println("PortID  // Coordinates (X/Y) // PortName");
        PortMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + "=========>" + entry.getValue().getCoordinates() + entry.getValue().getPortName());
        });
        System.out.println("");
    }

    public static void printMenu()
    {
        System.out.println("************************************************************************");
        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("1-) Create a container.");
        System.out.println("*********************************************");
        System.out.println("2-) Create a ship.");
        System.out.println("*********************************************");
        System.out.println("3-) Create a port.");
        System.out.println("*********************************************");
        System.out.println("4-) Load a container to a ship.");
        System.out.println("*********************************************");
        System.out.println("5-) Unload a container from a ship.");
        System.out.println("*********************************************");
        System.out.println("6-) Send ship to another port.");
        System.out.println("*********************************************");
        System.out.println("7-) Refuel ship.");
        System.out.println("*********************************************");
        System.out.println("");
        System.out.println("************************************************************************");
    }
}
