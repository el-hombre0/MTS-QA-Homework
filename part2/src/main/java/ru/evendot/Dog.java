package ru.evendot;

public class Dog extends Pet{

    /**
     * Конструктор собаки
     * @param breed Порода
     * @param name Имя
     * @param cost Стоимость
     * @param character Характер
     */
    public Dog(String breed, String name, Double cost, String character){
        super(breed, name, cost, character);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // проверка на идентичность
            return true;
        }
        if (!(obj instanceof Dog)) { // проверка типа объекта
            return false;
        }
        Dog other = (Dog) obj;
        return this.breed.equals(other.getBreed()) && this.name.equals(other.getName()) && this.cost == other.getCost()
                && this.character.equals(other.getCharacter()) && this.birthDate.equals(other.getBirthDate());
    }
}
