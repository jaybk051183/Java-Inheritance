package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {
    private int numberOfWelps;

    public Lion (String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, int numberOfWelps) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.numberOfWelps = numberOfWelps;
    }

    public int getNumberOfWelps(){
        return numberOfWelps;
    }

    public void setNumberOfWelps(int numberOfWelps) {
        this.numberOfWelps = numberOfWelps;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " roars");
    }
}
