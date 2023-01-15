package nl.novi.javaprogrammeren.overerving;

import nl.novi.javaprogrammeren.overerving.*;

public class AnimalMain {

    public static void main(String[] args) {
        Lion lion = new Lion("Simba", "African Savannah", "Male", "Monday", "Kenya", 3);
        lion.setName("Simba");
        lion.setEnclosureName("African Savannah");
        lion.setGender("Male");
        lion.setLastFedDay("Monday");
        lion.setCountryOfOrigin("Kenya");
        lion.setNumberOfWelps(3);

        Tiger tiger = new Tiger("Rajah", "Bengal Tiger Habitat", "Male", "Tuesday", "India", 100);
        tiger.setName("Rajah");
        tiger.setEnclosureName("Bengal Tiger Habitat");
        tiger.setGender("Male");
        tiger.setLastFedDay("Tuesday");
        tiger.setCountryOfOrigin("India");
        tiger.setNumberOfStripes(100);

        Dog dog = new Dog("Max", "Home", "John", "Purina", "Golden Retriever", "Male");
        dog.setName("Max");
        dog.setEnclosureName("Home");
        dog.setNameOfOwner("John");
        dog.setFavouriteFoodBrand("Purina");
        dog.setType("Golden Retriever");
        dog.setGender("Male");


        Cat cat = new Cat("Whiskers","Home","Jane","Friskies","Siamese","Female",false);
        cat.setName("Whiskers");
        cat.setEnclosureName("Home");
        cat.setNameOfOwner("Jane");
        cat.setFavouriteFoodBrand("Friskies");
        cat.setType("Siamese");
        cat.setGender("Female");
        cat.setindoorOrOutdoor(false);

        Wulf wolf = new Wulf("Luna","Timber Wolf Habitat","Female","Friday","Canada","Moon Pack");
        wolf.setName("Luna");
        wolf.setEnclosureName("Timber Wolf Habitat");
        wolf.setGender("Female");
        wolf.setLastFedDay("Friday");
        wolf.setCountryOfOrigin("Canada");
        wolf.setNameOfPack("Moon Pack");

        lion.move();
        lion.makeSound();
        lion.sleep();
        lion.eat("gazelle");

        tiger.move();
        tiger.makeSound();
        tiger.sleep();
        tiger.eat("pork");

        dog.move();
        dog.makeSound();
        dog.sleep();
        dog.eat("Purina");

        cat.move();
        cat.makeSound();
        cat.sleep();
        cat.eat("tuna");

        wolf.move();
        wolf.makeSound();
        wolf.sleep();
        wolf.eat("elk");
    }
}


    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.

    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst. public void move()

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */
