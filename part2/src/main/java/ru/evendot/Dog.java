package ru.evendot;

public class Dog extends Pet{
    public String breed; // Порода
    public String name; // Имя
    public Double cost; // Стоимость
    public String character; // Характер


    public Dog(String breed, String name, Double cost, String character){
        super(breed, name, cost, character);
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }
}
