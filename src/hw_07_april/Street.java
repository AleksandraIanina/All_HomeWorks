package hw_07_april;

import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.util.Objects;

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

    public static int count;

    public static int checkStreetCopiesCount(Street[] ArrayOf15Streets, Street street) {
        for (int i = 0; i < ArrayOf15Streets.length; i++) {
            if (ArrayOf15Streets[i].equals(street)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", key='" + key + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return name.equals(street.name) &&
                description.equals(street.description) &&
                key.equals(street.key);
    }


    public static void startExecution() {                            //ВЫЗОВ МЕТОДОВ

//        Street street_1 = new Street("name1");
//        System.out.println("New street in the our city!");
//        Street street_2 = new Street("name2", "descr2", "key2");
//        System.out.println("New street in the our city!");
//        Street street_3 = new Street();
//        System.out.println("New street in the our city!");
//        Street street_4 = new Street();
//        System.out.println("New street in the our city!");
//        Street street_5 = new Street("name5");
//        System.out.println("New street in the our city!");
//        Street street_6 = new Street();
//        System.out.println("New street in the our city!");
//        Street street_7 = new Street();
//        System.out.println("New street in the our city!");
//        Street street_8 = new Street("name8", "descr8", "key8");
//        System.out.println("New street in the our city!");
//        Street street_9 = new Street();
//        System.out.println("New street in the our city!");
//        Street street_10 = new Street("name9");
//        System.out.println("New street in the our city!");


        Street streetN_1 = new Street("name1", "descr1", "key1");
        Street streetN_2 = new Street("name2", "descr2", "key2");
        Street streetN_3 = new Street("Lenina");
        Street streetN_4 = new Street("name4", "descr4", "key4");
        Street streetN_5 = new Street("Lenina", "descr5", "key5");
        Street streetN_6 = new Street("name6", "descr6", "key6");
        Street streetN_7 = new Street("Lenina");
        Street streetN_8 = new Street("Lenina");
        Street streetN_9 = new Street();
        Street streetN_10 = new Street("name10", "descr10", "key10");
        Street streetN_11 = new Street("name11", "descr11", "key11");
        Street streetN_12 = new Street("name12", "descr12", "key12");
        Street streetN_13 = new Street("name13", "descr13", "key13");
        Street streetN_14 = new Street();
        Street streetN_15 = new Street("Lenina");


        //System.out.println(street_1.toString());


//        Street[] ArrayOfStreets = new Street[]{street_1, street_2, street_3, street_4, street_5, street_6, street_7, street_8, street_9, street_10};
//
//        for (int i = 0; i < ArrayOfStreets.length; i++) {
//            System.out.println(ArrayOfStreets[i]);
//        }

        Street[] ArrayOf15Streets = new Street[]{streetN_1, streetN_2, streetN_3, streetN_4, streetN_5, streetN_6, streetN_7, streetN_8, streetN_9, streetN_10, streetN_11, streetN_12, streetN_13, streetN_14, streetN_15};

        System.out.println("The number of equals streets " + checkStreetCopiesCount(ArrayOf15Streets, streetN_3));
    }
}



