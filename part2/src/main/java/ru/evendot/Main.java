package ru.evendot;

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
                animalsCreation.createAnimals();
                animalsCreation.createAnimals(N);
                animalsCreation.create10UniqueAnimals(dogBreeds, catBreeds, wolfBreeds,
                                sharkBreeds, names, costsDollars, characters, animals);
        }
}
