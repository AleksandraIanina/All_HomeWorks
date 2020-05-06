package hw_23_april;

import java.util.Arrays;

//public class ArrayOfAnimalsMethods {
//
//    public static void startLessonExample(){
//        //public String newName = "asia";
//        Animal[] animals = new Animal[]{
//                new Tiger(),
//                new Sheep(),
//                new Sheep("asya", 3)
//        };
//
//        System.out.println(Arrays.toString(animals));
//
//        /**
//         * Фильруем массив, возвращаем новый массив содержащий только экземпляры класса Sheep.
//         *
//         * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
//         * @return массив содежащий только экземпляры класса Sheep из массива.
//         */
//        public static Sheep[] filterOnlySheep(Animal[] animals)
//        {
//            Sheep[] result = new Sheep[0];
//
//            for (Animal animal :animals)
//            {
//                if(animal instanceof Sheep)
//                {
//                    result = prepareNewArray(result);
//                    Sheep sheep = (Sheep)animal;
//                    result[result.length-1] = sheep;
//                }
//            }
//            return result;
//        }
//
//        private static Sheep[] prepareNewArray(Sheep[] oldArray)
//        {
//            Sheep[] result = new Sheep[oldArray.length+1];
//            for (int j = 0; j<oldArray.length; j++)
//            {
//                result[j] = oldArray[j];
//            }
//            return result;
//        }
//
//        /**
//         * Определяем, какое животное нам прислали вторым аргументом, фильтруем массив элементов, исключая животных других типов.
//         * + в конце добавляем новое животное.
//         *
//         * @param animals массив потомков Animal. Может содержать Tiger и Sheep.
//         * @param newAnimal новое животное
//         *
//         * @return массив содежащий только экземпляры класса Sheep или Tiger из массива + новый элемент.
//         */
//        public static Animal[] filterOnlySelectedAnimal(Animal[] animals, Animal newAnimal)
//        {
//            //if (newAnimal.getClass() == animal.getClass())
//            return null;
//        }
//    }
//}

