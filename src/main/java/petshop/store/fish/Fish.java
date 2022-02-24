package petshop.store.fish;
import petshop.store.Pet;

public class Fish extends Pet implements Swim {
    private FishType fishType;

    public Fish(String name, Integer age, FishType fishType) {
        super(name, age);
        this.fishType = fishType;
    }

    @Override
    public String swim() {
        return "Swimming";
    }

    public FishType getFishType() {
        return fishType;
    }

    public void setFishType(FishType fishType) {
        this.fishType = fishType;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getAge() + " ID: " + getPetIdNumber() + " Type: " + fishType;
    }
}
