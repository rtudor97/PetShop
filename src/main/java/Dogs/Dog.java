package Dogs;

import store.Pet;

public class Dog extends Pet {
    private Breeds breeds;

    public Dog(String name, Integer age, Breeds breed){
        super(name, age);
        this.breeds = breed;

    }



}
g