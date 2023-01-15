package nl.novi.javaprogrammeren.overerving;

public class Wulf extends Animal {
    private String nameOfPack;

    public Wulf (String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin, String nameOfPack) {
        super(name, enclosureName, gender, lastFedDay, countryOfOrigin);
        this.nameOfPack = nameOfPack;
    }

    public String getNameOfPack() {
        return nameOfPack;
    }

    public void setNameOfPack (String nameOfPack) {
        this.nameOfPack = nameOfPack;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " howls");
    }
}
