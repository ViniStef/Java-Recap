package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbersList01 = new ArrayList<>();
        numbersList01.add(1);
        numbersList01.add(2);
        numbersList01.add(3);
        Integer[] numbersArray01 = numbersList01.toArray(new Integer[0]); // It's better to let java handle the sizing rather than giving it the size of the arraylist
        System.out.println(numbersList01);
        System.out.println(Arrays.toString(numbersArray01));

        System.out.println("-------------------");

        Integer[] numbersArray02 = {1, 2, 3};
        List<Integer> numbersList02 = Arrays.asList(numbersArray02); // This list will be backed by the original array
        numbersList02.set(0, 12); // this will affect both the array and the list
        // cannot use .add in this case!!!
        System.out.println(Arrays.toString(numbersArray02));
        System.out.println(numbersList02);

        System.out.println("-------------------");

        List<Integer> numbersList03 = new ArrayList<>(Arrays.asList(numbersArray02));
        numbersList03.add(19); // now it will work fine, and will only change values on this list!!
        System.out.println(numbersList03);

        // Note that these ones will behave like the numbersList02, where you cannot add normally!
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<String> strings = Arrays.asList("1", "2");
        List<String> strings1 = List.of("1", "2");
    }
}
