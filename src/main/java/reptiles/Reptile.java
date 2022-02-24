package reptiles;

import store.Pet;

public class Reptile extends Pet {
    private Reptile reptile;


    public Reptile(String name, Integer age, Reptile reptile) {
        super(name, age);
        this.reptile = reptile;
    }

}


