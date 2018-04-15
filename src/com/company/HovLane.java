package com.company;

import java.util.Random;

public class HovLane {
    int value;
    HovLane next;

    public HovLane(){
        Random rand= new Random();
        value=rand.nextInt(20);
        next=null;
    }

    @Override
    public String toString() {
        if(next==null)
            return " " + value;
        else
            return value + next.toString();
    }
}
