package hw_30_april_interface;

public class Plane implements IntarfaceLessonHW.Repairable {

    public boolean isNeedRepair = true;
    public static int costOfRepair = 500;



    public boolean isNeedToRepair(boolean x) {
        return false;
    }

    @Override
    public void repair(int cash) {
        if (cash > costOfRepair){
            System.out.println("нужен ли ремонт самолета - " + isNeedToRepair(isNeedRepair));
        }
        else{
            costOfRepair = costOfRepair - cash;
            System.out.println("Нужны еще деньги на ремонт самолета - " + costOfRepair);
        }

    }
}
