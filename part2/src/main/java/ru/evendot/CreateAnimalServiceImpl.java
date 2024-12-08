package ru.evendot;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    String[] dogBreeds;
    String[] catBreeds;
    String[] wolfBreeds;
    String[] sharkBreeds;
    String[] names;
    Double[] costsDollars;
    String[] characters;
    String[] animals;

    /**
    * Конструктор
    * @param dogBreeds Массив пород собак
    * @param catBreeds Массив пород котов
    * @param wolfBreeds Массив пород волков
    * @param sharkBreeds Массив пород акул
    * @param names Массив имен
    * @param costsDollars Массив стоимостей
    * @param characters Массив характеров
    * @param animals Массив типов животных
     */
    public CreateAnimalServiceImpl(String[] dogBreeds, String[] catBreeds, String[] wolfBreeds,
            String[] sharkBreeds, String[] names, Double[] costsDollars, String[] characters,
            String[] animals) {
        this.dogBreeds = dogBreeds;
        this.catBreeds = catBreeds;
        this.wolfBreeds = wolfBreeds;
        this.sharkBreeds = sharkBreeds;
        this.names = names;
        this.costsDollars = costsDollars;
        this.characters = characters;
        this.animals = animals;
    }

    /**
     * Перегруженный метод по созданию массива уникальных животных заданного количества при помощи цикла for 
     * @param N Количество уникальных животных
     * @return Массив уникальных животных
     */
    public AbstractAnimal[] createAnimals(int N) {
        System.out.println("=================== overloaded createAnimals ===================");
        AbstractAnimal[] overloadedAnimals = new AbstractAnimal[N];

        for (int i = 0; i < N; i++) {
            Random randAnimal = new Random();
            Random randName = new Random();
            Random randCost = new Random();
            Random randCharacter = new Random();
            switch (randAnimal.nextInt(this.animals.length)) {
                case 0:
                    Random randCatBreed = new Random(this.catBreeds.length);
                    Cat cat = new Cat(this.catBreeds[randCatBreed.nextInt(this.catBreeds.length)],
                            this.names[randName.nextInt(this.names.length)],
                            this.costsDollars[randCost.nextInt(this.costsDollars.length)],
                            this.characters[randCharacter.nextInt(this.characters.length)]);
                    // System.out.println(i + ": " + cat.toString());
                    overloadedAnimals[i] = cat;

                    break;

                case 1:
                    Random randDogBreed = new Random();
                    Dog dog = new Dog(dogBreeds[randDogBreed.nextInt(dogBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + dog.toString());
                    overloadedAnimals[i] = dog;
                    break;
                case 2:
                    Random randSharkBreed = new Random(sharkBreeds.length);
                    Shark shark = new Shark(sharkBreeds[randSharkBreed.nextInt(sharkBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + shark.toString());
                    overloadedAnimals[i] = shark;
                    break;
                case 3:
                    Random randWolfBreed = new Random(wolfBreeds.length);
                    Wolf wolf = new Wolf(wolfBreeds[randWolfBreed.nextInt(wolfBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + wolf.toString());
                    overloadedAnimals[i] = wolf;
                    break;
                default:
                    break;

            }

        }
        return overloadedAnimals;
    }
/**
     * Метод по созданию массива уникальных животных при помощи цикла do while 
     * @return Массив уникальных животных
     */
    public AbstractAnimal[] createAnimals() {
        System.out.println("=================== do while createAnimals ===================");
        final int N = 10;
        AbstractAnimal[] doWhileAnimals = new AbstractAnimal[N];
        int i = 0;
        do {
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
                    doWhileAnimals[i] = cat;
                    break;

                case 1:
                    Random randDogBreed = new Random(dogBreeds.length);
                    Dog dog = new Dog(dogBreeds[randDogBreed.nextInt(dogBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + dog.toString());
                    doWhileAnimals[i] = dog;
                    break;
                case 2:
                    Random randSharkBreed = new Random(sharkBreeds.length);
                    Shark shark = new Shark(sharkBreeds[randSharkBreed.nextInt(sharkBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + shark.toString());
                    doWhileAnimals[i] = shark;
                    break;
                case 3:
                    Random randWolfBreed = new Random(wolfBreeds.length);
                    Wolf wolf = new Wolf(wolfBreeds[randWolfBreed.nextInt(wolfBreeds.length)],
                            names[randName.nextInt(names.length)],
                            costsDollars[randCost.nextInt(costsDollars.length)],
                            characters[randCharacter.nextInt(characters.length)]);
                    // System.out.println(i + ": " + wolf.toString());
                    doWhileAnimals[i] = wolf;
                    break;
                default:
                    break;

            }
            i++;
        } while (i < N);

        return doWhileAnimals;
    }
}
