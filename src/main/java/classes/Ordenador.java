package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Ordenador {
    public static <T extends Comparable<T>> void sort(T[] array){
        Arrays.sort(array, Comparator.nullsLast(T::compareTo));
    }
}
