package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics {

        public static void main(String[] args) {

//            List list = new ArrayList<>();
//            list.add(3);
//            list.add("john");

            //using generics, type safety
            List<Integer> integerList = new ArrayList<>();
            integerList.add(3);
            integerList.add(Integer.valueOf("10"));

            Map<Integer, List<SuperKeyWord>> map = new HashMap<>();

            Integer[] integerArray = {10,20,30,40,50,60};
            Character[] characterArray = {'A', 'M', 'P', 'J'};

            System.out.println("Printing Integer Array");
            printArray(integerArray);

            System.out.println("Printing Character Array");
            printArray(characterArray);

        }

        public static <E> void printArray(E[] elements) {

            for (E element : elements) {
                System.out.print(element+",");
            }
            System.out.println();
        }
    }