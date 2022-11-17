package com.company;

import java.util.Objects;

public class HeavyBox implements Comparable{
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavyBox)) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return getWeight() == heavyBox.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        if(this == o) res = 0;
        HeavyBox heavyBox = (HeavyBox) o;
        if(weight == heavyBox.getWeight()) res = 1;
        else if(weight> heavyBox.getWeight()) res = 1;
        else res = -1;
        return res;
    }
    }
