package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Public Transportation!\n");

      HovLane lane = new HovLane(10);
        System.out.println( "hov (should be 10): " + lane );
        System.out.println( "hov has " + lane.size() + " cars." );

        lane.add( 20 );
        System.out.println( "hov (should be 10-20): " + lane );
        System.out.println( "hov has " + lane.size() + " cars." );


        //Todo How many cars are in the HOV lane?
        // Todo what are the id(s) of cars with only one occupant?
        //Todo How many [C] cars are in the HOV lane? [C] is a user provided car color

    }
}
