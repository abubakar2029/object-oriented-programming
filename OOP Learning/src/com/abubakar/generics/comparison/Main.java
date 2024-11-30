package com.abubakar.generics.comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HumanHeight AbuBakar = new HumanHeight(5.9f, "Abubakar");
        HumanHeight Ahmed = new HumanHeight(4.8f, "Ahmed");
        HumanHeight Abdul = new HumanHeight(6.8f, "Abdul");

        HumanHeight[] list = {AbuBakar, Ahmed, Abdul};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (AbuBakar.compareTo(Ahmed) > 0) {
            System.out.println("AbuBakar is taller than Ahmed");
        }
    }
}
