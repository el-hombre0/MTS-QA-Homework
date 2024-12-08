package ru.evendot;

import java.time.LocalDate;

public class Main {
        private final static int N = 5;

        static String[] dogBreeds = new String[] { "Calupoh", "Welsh Terrier", "Labrador", "Golden Retriever",
                        "German Shepherd" };
        static String[] catBreeds = new String[] { "Maine Coon", "Ragdoll", "British Shorthair", "Persian cat",
                        "Russian Blue" };
        static String[] wolfBreeds = new String[] { "Siberian Husky", "Arctic Wolf", "Himalayan wolf", "Red wolf",
                        "Eastern wolf" };
        static String[] sharkBreeds = new String[] { "White shark", "Tiger shark", "Blacktip Reef Shark", "Bull shark",
                        "Whale shark" };

        static String[] names = new String[] { "Max", "Charlie", "Bella", "Poppy", "Daisy", "Buster", "Alfie", "Millie",
                        "Molly", "Rosie" };
        static Double[] costsDollars = new Double[] { 45.00, 10000.00, 150.00, 236.99, 321.99, 80.00, 70.00, 469.99,
                        200.00, 23500.00 };
        static String[] characters = new String[] { "sanguine", "phlegmatic", "melancholy", "choleric" };
        static String[] animals = new String[] { "Cat", "Dog", "Wolf", "Shark" };

        public static void main(String[] args) {
                CreateAnimalServiceImpl animalsCreation = new CreateAnimalServiceImpl(dogBreeds, catBreeds, wolfBreeds,
                                sharkBreeds, names, costsDollars, characters, animals);
                AbstractAnimal[] doWhileAnimals = animalsCreation.createAnimals();
                AbstractAnimal[] overloadedAnimals = animalsCreation.createAnimals(N);
                AbstractAnimal[] defaultAnimals = animalsCreation.create10UniqueAnimals(dogBreeds, catBreeds,
                                wolfBreeds,
                                sharkBreeds, names, costsDollars, characters, animals);

                // Соединение
                AbstractAnimal[] allAnimals = new AbstractAnimal[doWhileAnimals.length + overloadedAnimals.length
                                + defaultAnimals.length];
                System.arraycopy(doWhileAnimals, 0, allAnimals, 0, doWhileAnimals.length);
                System.arraycopy(overloadedAnimals, 0, allAnimals, doWhileAnimals.length, overloadedAnimals.length);
                System.arraycopy(defaultAnimals, 0, allAnimals, doWhileAnimals.length + overloadedAnimals.length,
                                defaultAnimals.length);

                SearchServiceImpl animalsSearch = new SearchServiceImpl();

                // Создание животного с високосным годом рождения на случай, если такой не
                // сгенерируется
                Wolf leapYearWolf = new Wolf(wolfBreeds[1], names[0], costsDollars[3], characters[2],
                                LocalDate.of(2012, 3, 16));
                allAnimals[5] = leapYearWolf;
                AbstractAnimal[] leapYearsAnimals = animalsSearch.findLeapYearNames(allAnimals);

                // Вывод високосных
                for (AbstractAnimal abstractAnimal : leapYearsAnimals) {
                        if (abstractAnimal != null)
                                System.out.println(abstractAnimal.toString());
                }

                // Создание старого животного на случай, если такой не сгенерируется
                Wolf oldWolf = new Wolf(wolfBreeds[1], names[0], costsDollars[3], characters[2],
                                LocalDate.of(2000, 3, 16));
                allAnimals[5] = oldWolf;
                AbstractAnimal[] olderAnimal = animalsSearch.findOlderAnimal(allAnimals, 13);

                // Вывод старше заданного возраста
                for (AbstractAnimal abstractAnimal : olderAnimal) {
                        if (abstractAnimal != null)
                                System.out.println(abstractAnimal.toString());
                }

                // Создание одинаковых объектов на случай, если не сгенерируются одинаковые
                Wolf eqWolf1 = new Wolf(wolfBreeds[1], names[0], costsDollars[3], characters[2],
                                LocalDate.of(2015, 3, 16));
                Wolf eqWolf2 = new Wolf(wolfBreeds[1], names[0], costsDollars[3], characters[2],
                                LocalDate.of(2015, 3, 16));
                allAnimals[5] = eqWolf1;
                allAnimals[10] = eqWolf2;

                // Вывод дубликатов
                animalsSearch.findDuplicate(allAnimals);

        }
}
