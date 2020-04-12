package hw_07_april;

import hw_02_april.Dog;

public class City {

    private String name;
    private int citizenNumber;

    public static void startExecution(){                         //ВЫЗОВ МЕТОДОВ

        City city1 = new City();
        City city2 = new City();
        City city3 = new City();
        City city4 = new City();
        City city5 = new City();
        City city6 = new City();
        City city7 = new City();


        city1.name = "Voronezh";
        city2.name = "Moscow";
        city3.name = "Paris";
        city4.name = "London";
        city5.name = "Milan";
        city6.name = "Berlin";
        city7.name = "Bern";

        city1.citizenNumber = 10;
        city2.citizenNumber = 20;
        city3.citizenNumber = 30;
        city4.citizenNumber = 40;
        city5.citizenNumber = 50;
        city6.citizenNumber = 60;
        city7.citizenNumber = 70;


        System.out.println(city1.name + " " + city1.citizenNumber);
        System.out.println(city2.name + " " + city2.citizenNumber);
        System.out.println(city3.name + " " + city3.citizenNumber);
        System.out.println(city4.name + " " + city4.citizenNumber);
        System.out.println(city5.name + " " + city5.citizenNumber);
        System.out.println(city6.name + " " + city6.citizenNumber);
        System.out.println(city7.name + " " + city7.citizenNumber);



    }
}
