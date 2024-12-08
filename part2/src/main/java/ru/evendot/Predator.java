package ru.evendot;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {

    protected String breed; // Порода
    protected String name; // Имя
    protected Double cost; // Стоимость
    protected String character; // Характер
    protected LocalDate birthDate; // День рождения животного в формате dd-MM-yyyy.
    
    public Predator(String breed, String name, Double cost, String character){
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

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

    public String toString() {
        return this.getClass().getSimpleName() + "{" + "breed=" + getBreed() + ", name=" + getName() + ", cost=" + getCost()
                + ", character=" + getCharacter() + "}";

    }
}
