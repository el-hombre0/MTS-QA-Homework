package ru.evendot;

public class Cat extends Pet{
    public String breed; // Порода
    public String name; // Имя
    public Double cost; // Стоимость
    public String character; // Характер

    public Cat(String breed, String name, Double cost, String character){
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }
}
