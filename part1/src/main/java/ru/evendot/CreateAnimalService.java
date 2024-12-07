package ru.evendot;

import java.util.Random;

public interface CreateAnimalService {

        default public void create10UniqueAnimals(String[] dogBreeds, String[] catBreeds, String[] wolfBreeds,
                        String[] sharkBreeds, String[] names, Double[] costsDollars, String[] characters,
                        String[] animals) {
                System.out.println("=================== default createAnimals ===================");
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
                                        System.out.println(i + ": " + cat.toString());
                                        break;

                                case 1:
                                        Random randDogBreed = new Random(dogBreeds.length);
                                        Dog dog = new Dog(dogBreeds[randDogBreed.nextInt(dogBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        System.out.println(i + ": " + dog.toString());
                                        break;
                                case 2:
                                        Random randSharkBreed = new Random(sharkBreeds.length);
                                        Shark shark = new Shark(sharkBreeds[randSharkBreed.nextInt(sharkBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        System.out.println(i + ": " + shark.toString());
                                        break;
                                case 3:
                                        Random randWolfBreed = new Random(wolfBreeds.length);
                                        Wolf wolf = new Wolf(wolfBreeds[randWolfBreed.nextInt(wolfBreeds.length)],
                                                        names[randName.nextInt(names.length)],
                                                        costsDollars[randCost.nextInt(costsDollars.length)],
                                                        characters[randCharacter.nextInt(characters.length)]);
                                        System.out.println(i + ": " + wolf.toString());
                                        break;
                                default:
                                        break;

                        }
                        i++;
                }
        }
}
