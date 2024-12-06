package ru.evendot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public interface CreateAnimalService {
    HashMap<Integer, String> animals = new HashMap<Integer, String>();
    String[] dogBreeds = new String[] { "Calupoh", "Welsh Terrier", "Labrador", "Golden Retriever", "German Shepherd" };
    String[] catBreeds = new String[] { "Maine Coon", "Ragdoll", "British Shorthair", "Persian cat", "Russian Blue" };
    String[] wolfBreeds = new String[] { "Siberian Husky", "Arctic Wolf", "Himalayan wolf", "Red wolf",
            "Eastern wolf" };
    String[] sharkBreeds = new String[] { "White shark", "Tiger shark", "Blacktip Reef Shark", "Bull shark",
            "Whale shark" };

    String[] names = new String[] { "Max", "Charlie", "Bella", "Poppy", "Daisy", "Buster", "Alfie", "Millie", "Molly",
            "Rosie" };
    Double[] costsDollars = new Double[] { 45.00, 10000.00, 150.00, 236.99, 321.99, 80.00, 70.00, 469.99, 200.00,
            23500.00 };
    String [] characters = new String[] {"sanguine", "phlegmatic", "melancholy", "choleric"};
    default public void createAnimals(){
        int counter = 0;
        
        while(counter != 10){
            Random rand = new Random();
            System.out.println(myArray[rand.nextInt(myArray.length)]);

        }
    }
}
