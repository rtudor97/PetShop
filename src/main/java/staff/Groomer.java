package staff;

public class Groomer extends Employee implements Grooming<T>{
    public Groomer(String name) {
        super(name);
    }

    @Override
    public void groomPets(T pet) {

    }
}
