package com.codecool.farm.animal;

public abstract class Animal {
    int size;

    public Animal() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void feed(){}
}
