package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Animal {
    private int numberOfStripes;

    public Tiger (String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, int numberOfStripes) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes (int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " growls");
    }

}
