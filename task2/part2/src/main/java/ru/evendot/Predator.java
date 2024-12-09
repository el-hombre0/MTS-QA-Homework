package ru.evendot;

import java.time.LocalDate;
import java.util.Random;

public class Predator extends AbstractAnimal {

    protected String breed; // Порода
    protected String name; // Имя
    protected Double cost; // Стоимость
    protected String character; // Характер
    protected LocalDate birthDate; // День рождения животного в формате dd-MM-yyyy.

    /**
     * Конструктор хищника
    * @param breed Порода
    * @param name Имя
    * @param cost Стоимость
    * @param character Характер
    */
    public Predator(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;

        Random randDate = new Random();
        this.birthDate = LocalDate.of(randDate.nextInt(2010, 2025), randDate.nextInt(1, 13), randDate.nextInt(1, 29));
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

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    /**
     * Метод вывода объекта в строку
     * @return Строковое представление объекта
     */
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "breed=" + getBreed() + ", name=" + getName() + ", cost="
                + getCost()
                + ", character=" + getCharacter() + ", birthDate=" + getBirthDate().getDayOfMonth() + "-"
                + getBirthDate().getMonthValue() + "-" + getBirthDate().getYear() + "}";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // проверка на идентичность
            return true;
        }
        if (!(obj instanceof Predator)) { // проверка типа объекта
            return false;
        }
        Predator other = (Predator) obj;
        return this.breed.equals(other.getBreed()) && this.name.equals(other.getName()) && this.cost == other.getCost()
                && this.character.equals(other.getCharacter()) && this.birthDate.equals(other.getBirthDate());
    }

}
