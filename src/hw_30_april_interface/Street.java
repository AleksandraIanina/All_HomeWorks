package hw_30_april_interface;

public class Street implements IntarfaceLessonHW.Repairable {
    @Override
    public void repair(int cash) {
        System.out.println("Не хватает денег на ремонт улицы");
    }

    @Override
    public boolean isNeedToRepair(boolean x) {
        return false;
    }
}
