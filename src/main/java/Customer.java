import staff.Person;

public class Customer<P> extends Person {
    private Integer idCount = 0;
    private Integer idNumber;
   // private P item;

    public Customer(String name) {
        super(name);
    }
    public String greeting(){
        return "Hello, I'm fine thank you for asking";
    }

    public String makePurchase(P item){
        return "You purchased " + item;
    }

}
