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

    public void createAnimals(int N) {
        System.out.println("=================== overloaded createAnimals ===================");

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
                    System.out.println(i + ": " + cat.toString());
                    break;

                case 1:
                    Random randDogBreed = new Random();
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

        }
    }

    public void createAnimals() {
        System.out.println("=================== do while createAnimals ===================");
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
        } while (i < 10);
    }
}
