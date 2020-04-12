package hw_02_april;

public class Dog {
    static String poroda = "пудель";
    static String klichka = "шарик";
    static int age = 5;
    static String sex = "male";
    static String favoriteToy = "catToy";

    public static void gaf() {
        System.out.println("гав-гав");
    }

    public static int getAge() {
        return age;
    }

    public static int showAge()      //метод, позволяющий вызвать в Main переменную с доступом default
    {
        return age;
    }

    public static int appendYear(int count) {
        int updatedAge = age + count;
        return updatedAge;
    }


    public static boolean guessAge(int[] optionArray) {
        boolean a = false;
        System.out.println(Dog.getAge());
        for (int i = 0; i < optionArray.length; i++) {
            if (optionArray[i] == Dog.getAge()) {
                //System.out.println("true");
                a = true;
                return a;
            } else {

            }
        }
        //System.out.println("false");

        return a;
    }

    public static void getSex(){
        System.out.println(Dog.sex);
    }

    public static String showSex(){       //метод, позволяющий вызвать в Main переменную с доступом default
        return sex;
    }

    public static void changeSex(String s){
        if(s == "male"){
            sex = "female";
            System.out.println("Sex was change to " + sex);
        }
        else if(s == "female"){
            sex = "male";
            System.out.println("Sex was change to " + sex);
        }
    }


    public static void startExecution(){                         //ВЫЗОВ МЕТОДОВ
        Dog.gaf();                                               //вызываю метод gaf()

        int a = Dog.appendYear(200);                      //вызываю метод appendYear()
        if (a < 200) {
            System.out.println(a);
        } else {
            int b = Dog.showAge();
            System.out.println("Что-то здесь не так " + b);
        }

        int [] numbersArray = {6,5,8,1,12};

        System.out.println(Dog.guessAge(numbersArray));          //вызываю метод guessAge()
        Dog.getSex();                                            //вызываю метод getSex()
        Dog.changeSex(sex);                                      //вызываю метод changeSex()
    }
}





