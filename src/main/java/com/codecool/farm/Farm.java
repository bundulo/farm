package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Cattle;
import com.codecool.farm.animal.Pig;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Farm {
    List<Animal> animals;

    public Farm(List<Animal> animalList) {
        this.animals = animalList;
    }

    public void feedAnimals(){
        for (int i = 0; i < animals.size(); i++) {
            this.animals.get(i).feed();
        }
    }

    public void butcher(Butcher butcher){
        for (int i = 0; i < animals.size(); i++) {
            if (butcher.canButcher(animals.get(i))){
                animals.remove(animals.get(i));
            }
        }
    }

    public boolean isEmpty(){
        return animals.isEmpty();
    }

    public List<String> getStatus(){
        List<String> animalFarmStatus = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cattle){
                animalFarmStatus.add("There is a " + animals.get(i).getSize() + " sized cattle in the farm.");
            }
            if (animals.get(i) instanceof Pig){
                animalFarmStatus.add("There is a " + animals.get(i).getSize() + " sized pig in the farm.");
            }
        }
        return animalFarmStatus;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
