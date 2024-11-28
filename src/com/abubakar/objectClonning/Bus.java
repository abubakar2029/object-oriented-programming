package com.abubakar.objectClonning;

// shallow deep clonning
public class Bus implements Cloneable {
    String busId;
    String driverName;
    int[] reserveSeats;

    public Bus(String busId, String driverName, int[] reserveSeats) {
        this.busId = busId;
        this.driverName = driverName;
        this.reserveSeats = reserveSeats;
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // Shallow Copy
//    }

    protected Object clone() throws CloneNotSupportedException {
        Bus clone = (Bus) super.clone();

        clone.reserveSeats = new int[clone.reserveSeats.length];

//        builtIn method of deep copying an array
//        clone.reserveSeats=this.reserveSeats.clone();

//        Manual copying
        for (int i = 0; i < clone.reserveSeats.length; i++) {
            clone.reserveSeats[i] = this.reserveSeats[i];
        }
        return clone;

    }
}
