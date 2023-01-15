package nl.novi.javaprogrammeren.overerving;
public class Animal {
    public String name;
    private String enclosureName;
    private String gender;
    private String lastFedDay;
    private String countryOfOrigin;

    public Animal(String name, String enclosureName, String gender, String lastFedDay, String countryOfOrigin) {
        this.name = name;
        this.enclosureName = enclosureName;
        this.gender = gender;
        this.lastFedDay = lastFedDay;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Animal(String name, String enclosureName, String gender) {
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void setEnclosureName(String enclosureName){
        this.enclosureName = enclosureName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getLastFedDay() {
        return lastFedDay;
    }

    public void setLastFedDay(String lastFedDay){
        this.lastFedDay = lastFedDay;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void move() {
        System.out.println(name + " has moved 0.25 meters");
    }

    public void makeSound(){}

    public void sleep() {
        System.out.println(name + " sleeps for eight hours per day");
    };

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
}
