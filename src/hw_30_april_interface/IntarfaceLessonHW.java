package hw_30_april_interface;

import static hw_30_april_interface.Plane.costOfRepair;

public class IntarfaceLessonHW {

    interface Repairable{
        void repair(int cash);
        boolean isNeedToRepair(boolean x);
    }

    public static void startExecution() {

        int cash = 100000;

        Repairable[] array = new Repairable[]{                     //ВЫЗОВ МЕТОДОВ
                new Street(),
                new Car(),
                new Plane(),
                new Plane(),
                new Plane()
        };

        for (Repairable repairable : array){
            if (repairable instanceof Street){
                Street street = (Street)repairable;
                street.repair(cash);
            }
            if (repairable instanceof Car){
                Car car = (Car) repairable;
                car.repair(cash);
            }
            if (repairable instanceof Plane){
                Plane plane = (Plane) repairable;
                plane.repair(cash);
                System.out.println(cash = cash - costOfRepair);
            }
        }

    }
}
