package ru.evendot;

import java.time.LocalDate;

public interface Animal {
    
    /**
     * Получение породы
     * @return Порода животного
     */
    public String getBreed();

    /**
     * Получение имени
     * @return Имя животного
     */
    public String getName();

    /**
     * Получение стоимости
     * @return Стоимость животного
     */
    public Double getCost();

    /**
     * Получение характера
     * @return Характер животного
     */
    public String getCharacter();

    /**
     * Получение даты рождения
     * @return Дата рождения животного
     */
    public LocalDate getBirthDate();

    /**
     * Сравнение животных
     * @param obj Сравниваемый объект животного
     * @return Объектны животных равны или нет
     */
    public boolean equals(Object obj);

}