package hw_30_april_interface;

public class Car implements IntarfaceLessonHW.Repairable {

    public boolean isNeedRepair = true;

    @Override
    public boolean isNeedToRepair(boolean x) {
        return false;
    }

    @Override
    public void repair(int cash) {
        if (cash > 10){
            System.out.println("Машина отремонтирована");
            System.out.println("нужен ли ремонт машины - " + isNeedToRepair(isNeedRepair));
        }
        else {
            System.out.println("Не хватает денег на ремонт машины");
        }

    }


}
