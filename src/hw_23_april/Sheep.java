package hw_23_april;

public class Sheep extends Animal {

    private String name = "default name";
    private int numberOfLegs = 4;

    public Sheep(){
    }

    public Sheep(String newName) {
        this();
        name = newName;
    }

    public Sheep(String newName, int numberOfLegs){
        this.name = newName;
        this.numberOfLegs = numberOfLegs;
    }


}
