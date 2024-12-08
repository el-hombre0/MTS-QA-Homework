package ru.evendot;

import java.time.LocalDate;
import java.time.Period;

public class SearchServiceImpl implements SearchService {

    @Override
    public AbstractAnimal[] findLeapYearNames(AbstractAnimal[] animals) {
        System.out.println("=================== findLeapYearNames ===================");
        AbstractAnimal[] leapYearAnimals = new AbstractAnimal[animals.length];
        for (int i = 0; i < animals.length; i++) {
            int year = animals[i].getBirthDate().getYear();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYearAnimals[i] = animals[i];
            }
        }
        return leapYearAnimals;
    }

    /**
     * Определение старше или младше животное заданного возраста
     * 
     * @param birthDate Дата рождения
     * @param years     Заданное количество лет
     */
    public static boolean isOlderThanNYears(LocalDate birthDate, int years) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Дата рождения не может быть null");
        }

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        return age.getYears() > years;
    }

    @Override
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int N) {
        System.out.println("=================== findOlderAnimal ===================");
        AbstractAnimal[] olderAnimals = new AbstractAnimal[animals.length];
        for (int i = 0; i < animals.length; i++) {
            LocalDate birthDate = animals[i].getBirthDate();
            boolean isOlder = isOlderThanNYears(birthDate, N);
            if (isOlder) {
                olderAnimals[i] = animals[i];
            }
        }
        return olderAnimals;
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        System.out.println("=================== findDuplicate ===================");
        for (int i = 0; i < animals.length - 1; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j]))
                    System.out.println("The " + animals[i].toString() + " is an equivalent of " + animals[j] + "\n");
            }
        }
    }

}
