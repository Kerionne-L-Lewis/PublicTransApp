package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Public Transportation!\n");

        HovLane M1 = new HovLane();
        HovLane M2 = new HovLane();
        HovLane M3 = new HovLane();
        HovLane M4 = new HovLane();

        System.out.println("Hov Lane: " + M1 + "" + M2 + "" + M3 + "" + M4);

        //Todo How many cars are in the HOV lane?
        // Todo what are the id(s) of cars with only one occupant?
        //Todo How many [C] cars are in the HOV lane? [C] is a user provided car color

    }
}
