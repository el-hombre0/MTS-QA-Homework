package ru.evendot;

import java.time.LocalDate;

public class Wolf extends Predator {

    /**
     * Конструктор волка по умолчанию
     * 
     * @param breed     Порода
     * @param name      Имя
     * @param cost      Стоимость
     * @param character Характер
     */
    public Wolf(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    /**
     * Перегруженный конструктор волка для демонстрации работы метода сравнения двух
     * объектов, чтобы искусственно создать двух одинаковых животных
     * 
     * @param breed     Порода
     * @param name      Имя
     * @param cost      Стоимость
     * @param character Характер
     * @param birthDate Дата рождения
     */
    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character);
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // проверка на идентичность
            return true;
        }
        if (!(obj instanceof Wolf)) { // проверка типа объекта
            return false;
        }
        Wolf other = (Wolf) obj;
        return this.breed.equals(other.getBreed()) && this.name.equals(other.getName()) && this.cost == other.getCost()
                && this.character.equals(other.getCharacter()) && this.birthDate.equals(other.getBirthDate());
    }
}
