package ru.evendot;

public class Pet extends AbstractAnimal {

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getCost() {
       return this.cost;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }
    
}
