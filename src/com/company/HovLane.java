package com.company;


public class HovLane {
    int value;
    HovLane next;
    HovLane head;


    public HovLane(int i){
        value=i;
        next=null;

    }



    public int size() {
        int count = 0;
        while (next != null) {
            count++;
        }
        return count;
    }

    public void add(int i) {
        while (next != null) {
          head = new HovLane(i);
        }
    }



    @Override
    public String toString() {
        if(next==null)
            return " "  + value;
        else
            return value + next.toString();
    }
}
