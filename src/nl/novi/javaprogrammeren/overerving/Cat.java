package nl.novi.javaprogrammeren.overerving;

public class Cat extends Animal {
    private String nameOfOwner;
    private String favouriteFoodBrand;
    private String type;
    private boolean indoorOrOutdoor;

    public Cat (String name, String enclosureName, String gender, String nameOfOwner, String favouriteFoodBrand, String type, boolean indoorOrOutdoor) {
        super(name, enclosureName, gender);
        this.nameOfOwner = nameOfOwner;
        this.favouriteFoodBrand = favouriteFoodBrand;
        this.type = type;
        this.indoorOrOutdoor = indoorOrOutdoor;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner (String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getFavouriteFoodBrand() {
        return favouriteFoodBrand;
    }

    public void setFavouriteFoodBrand (String favouriteFoodBrand) {
        this.favouriteFoodBrand = favouriteFoodBrand;
    }

    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public boolean getindoorOrOutdoor () {
        return indoorOrOutdoor;
    }

    public void setindoorOrOutdoor (boolean indoorOrOutdoor) {
        this.indoorOrOutdoor = indoorOrOutdoor;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " meows");
    }
}
