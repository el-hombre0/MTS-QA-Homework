package ru.evendot;

public class Shark extends Predator {

    /**
     * Конструктор акулы
     * @param breed Порода
     * @param name Имя
     * @param cost Стоимость
     * @param character Характер
     */
    public Shark(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // проверка на идентичность
            return true;
        }
        if (!(obj instanceof Shark)) { // проверка типа объекта
            return false;
        }
        Shark other = (Shark) obj;
        return this.breed.equals(other.getBreed()) && this.name.equals(other.getName()) && this.cost == other.getCost()
                && this.character.equals(other.getCharacter()) && this.birthDate.equals(other.getBirthDate());
    }
}
