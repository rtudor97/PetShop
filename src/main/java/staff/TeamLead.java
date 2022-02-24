package staff;

public class TeamLead extends Employee implements Grooming<T>, Feeder{

    public void openStore() {
        System.out.println("7am Doors opened");
    }

    public void closeStore(){
        System.out.println("8pm Doors locked");
    }

    public TeamLead(String name) {
        super(name);
    }

    @Override
    public void feedPets() {

    }


    @Override
    public void groomPets(T pet) {

    }
}
