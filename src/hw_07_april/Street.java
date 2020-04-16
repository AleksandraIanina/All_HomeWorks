package hw_07_april;

import javax.xml.namespace.QName;
import java.lang.reflect.Array;

public class Street extends Object {

    private String name = "startName";
    private String description = "startDescription";
    private String key = "startKey";

    public Street() {
    }

    public Street(String name, String description, String key) {
        this.name = name;
        this.description = description;
        this.key = key;
    }

    public Street(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", key='" + key + '\'' +
                '}';
    }

    public static void startExecution(){                            //ВЫЗОВ МЕТОДОВ

        Street street_1 = new Street("name1");
        System.out.println("New street in the our city!");
        Street street_2 = new Street("name2", "descr3", "key2");
        System.out.println("New street in the our city!");
        Street street_3 = new Street();
        System.out.println("New street in the our city!");
        Street street_4 = new Street();
        System.out.println("New street in the our city!");
        Street street_5 = new Street("name5");
        System.out.println("New street in the our city!");
        Street street_6 = new Street();
        System.out.println("New street in the our city!");
        Street street_7 = new Street();
        System.out.println("New street in the our city!");
        Street street_8 = new Street("name8", "descr8", "key8");
        System.out.println("New street in the our city!");
        Street street_9 = new Street();
        System.out.println("New street in the our city!");
        Street street_10 = new Street("name9");
        System.out.println("New street in the our city!");

        System.out.println(street_1.toString());


        Street[] ArrayOfStreets = new Street[]{ street_1, street_2, street_3, street_4, street_5, street_6, street_7, street_8, street_9, street_10};

        for (int i = 0; i < ArrayOfStreets.length; i++) {
            System.out.println(ArrayOfStreets[i]);
        }





    }
}

