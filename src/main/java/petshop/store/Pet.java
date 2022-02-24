package petshop.store;

public abstract class Pet {
    private String name;
    private Integer age;
    private Integer idCount = 0;
    private static Integer petIdNumber;

    public Pet(String name, Integer age){
        this.name = name;
        this.age = age;
        petIdNumber = idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public static Integer getPetIdNumber() {
        return petIdNumber;
    }

    public static void setPetIdNumber(Integer petIdNumber) {
        Pet.petIdNumber = petIdNumber;
    }

    @Override
    public String toString(){
        return name + " " + age + " ID: " + petIdNumber;
    }

}
