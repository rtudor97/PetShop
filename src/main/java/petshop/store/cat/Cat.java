package petshop.store.cat;

import petshop.store.Pet;

public class Cat extends Pet implements MakeNoise {
    private Breed breed;

    public Cat(String name, Integer age, Breed breed) {
        super(name, age);
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getAge() + " ID: " + getPetIdNumber() + " Breed: " + breed;
    }

}
