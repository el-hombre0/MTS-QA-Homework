package ru.evendot;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed; // Порода
    protected String name; // Имя
    protected Double cost; // Стоимость
    protected String character; // Характер
    protected LocalDate birthDate; // День рождения животного в формате dd-MM-yyyy.
}
