package com.abubakar.objectClonning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bus faisalMovers = new Bus("FSD-324", "Muhammad AbuBakar", new int[]{1, 2, 3});

        System.out.println("Bus Number: " + faisalMovers.busId);
//        System.out.println("Driver Name: " + faisalMovers.driverName);
        System.out.print("Reserve Seats: " + Arrays.toString(faisalMovers.reserveSeats));

        Bus saniaExpress = (Bus) faisalMovers.clone();
//        System.out.print("\nReserve Seats: " + Arrays.toString(saniaExpress.reserveSeats));

        saniaExpress.reserveSeats[2] = 9;
        System.out.print("\nReserve Seats: " + Arrays.toString(saniaExpress.reserveSeats));

//      here change in saniaExpress also make change in faisalMovers - it's a shallow copy
        System.out.print("\nReserve Seats: " + Arrays.toString(faisalMovers.reserveSeats));
    }
}
