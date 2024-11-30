package com.abubakar.generics.comparison;

public class HumanHeight implements Comparable<HumanHeight> {
    float height;
    String name;

    public HumanHeight(float height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(HumanHeight o) {
        System.out.println((int)(this.height - o.height));
        return (int) (this.height - o.height);
    }
}
