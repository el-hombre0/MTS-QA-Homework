package ru.evendot;

public class Wolf extends Predator {
    public String breed; // Порода
    public String name; // Имя
    public Double cost; // Стоимость
    public String character; // Характер

    public Wolf(String breed, String name, Double cost, String character){
        super(breed, name, cost, character);
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }
}
