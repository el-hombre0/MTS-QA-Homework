package ru.evendot;

public class Predator extends AbstractAnimal {

    protected String breed; // Порода
    protected String name; // Имя
    protected Double cost; // Стоимость
    protected String character; // Характер

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
