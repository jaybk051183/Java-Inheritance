package nl.novi.javaprogrammeren.overerving;

public class Dog extends Animal {
    private String nameOfOwner;
    private String favouriteFoodBrand;
    private String type;

    public Dog (String name, String enclosureName, String gender, String nameOfOwner, String favouriteFoodBrand, String type) {
        super(name, enclosureName, gender);
        this.nameOfOwner = nameOfOwner;
        this.favouriteFoodBrand = favouriteFoodBrand;
        this.type = type;
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

    @Override
    public void makeSound(){
        System.out.println(name + " barks");
    }

}
