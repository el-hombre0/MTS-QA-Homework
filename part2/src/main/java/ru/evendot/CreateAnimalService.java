package ru.evendot;

import java.util.Random;

public interface CreateAnimalService {

        /**
         * Получение 10 уникальных животных
         * @param dogBreeds Массив пород собак
         * @param catBreeds Массив пород котов
         * @param wolfBreeds Массив пород волков
         * @param sharkBreeds Массив пород акул
         * @param names Массив имен
         * @param costsDollars Массив стоимостей
         * @param characters Массив характеров
         * @param animals Массив типов животных
         * @return Массив уникальных объектов животных
         */
        default public AbstractAnimal[] create10UniqueAnimals(String[] dogBreeds, String[] catBreeds, String[] wolfBreeds,
                        String[] sharkBreeds, String[] names, Double[] costsDollars, String[] characters,
                        String[] animals) {
                System.out.println("=================== default createAnimals ===================");
                AbstractAnimal[] defaultAnimals = new AbstractAnimal[10];
                int i = 0;
                while (i != 10) {
                        Random randAnimal = new Random();
                        Random randName = new Random();
                        Random randCost = new Random();
                        Random randCharacter = new Random();
                        switch (randAnimal.nextInt(animals.length)) {
                                case 0:
                                        Random randCatBreed = new Random(catBreeds.length);
                                        Cat cat = new Cat(catBreeds[randCatBreed.nextInt(catBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        // System.out.println(i + ": " + cat.toString());
                                        defaultAnimals[i] = cat;
                                        break;

                                case 1:
                                        Random randDogBreed = new Random(dogBreeds.length);
                                        Dog dog = new Dog(dogBreeds[randDogBreed.nextInt(dogBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        // System.out.println(i + ": " + dog.toString());
                                        defaultAnimals[i] = dog;
                                        break;
                                case 2:
                                        Random randSharkBreed = new Random(sharkBreeds.length);
                                        Shark shark = new Shark(sharkBreeds[randSharkBreed.nextInt(sharkBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        // System.out.println(i + ": " + shark.toString());
                                        defaultAnimals[i] = shark;
                                        break;
                                case 3:
                                        Random randWolfBreed = new Random(wolfBreeds.length);
                                        Wolf wolf = new Wolf(wolfBreeds[randWolfBreed.nextInt(wolfBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        // System.out.println(i + ": " + wolf.toString());
                                        defaultAnimals[i] = wolf;
                                        break;
                                default:
                                        break;

                        }
                        i++;
                }
                return defaultAnimals;
        }
}
