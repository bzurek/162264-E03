package Z1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;

public class Zad1 {
    public static <T extends Object> void redukuj(LinkedList<T> linkedList, int n){
        for(int i=0; i<= linkedList.size()-1; i+=(n-1)){
            linkedList.remove(i);
        }
    }

    public static void main(String[] args) {
        Integer[] unosrtedInts = new Integer[]{18,9,648,3,47,90};
        Integer[] sortedInts= new Integer[]{5,6,7,8,94,95,903};
        LocalDate[] sortedDate = new LocalDate[]
                {
                        LocalDate.of(2022,2,14),
                        LocalDate.of(2022,2,15),
                        LocalDate.of(2022,2,16),
                        LocalDate.of(2022,2,17),
                        LocalDate.of(2022,2,18)
                };
        LocalDate[] unsortedDate= new LocalDate[]
                {
                        LocalDate.of(2022,2,15),
                        LocalDate.of(2022,2,18),
                        LocalDate.of(2022,2,16),
                        LocalDate.of(2022,2,14)
                };
        LinkedList<Integer> integers1= new LinkedList<Integer>(Arrays.asList(unosrtedInts));
        LinkedList<Integer> integers2= new LinkedList<Integer>(Arrays.asList(sortedInts));
        LinkedList<LocalDate> Localdates1= new LinkedList<LocalDate>(Arrays.asList(unsortedDate));
        LinkedList<LocalDate> Localdates2= new LinkedList<LocalDate>(Arrays.asList(sortedDate));
        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println(Localdates1);
        System.out.println(Localdates2);
        redukuj(integers1, 2);
        redukuj(integers2, 2);
        redukuj(Localdates1, 2);
        redukuj(Localdates2,2);
        System.out.println("REDUKCJA");
        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println(Localdates1);
        System.out.println(Localdates2);
    }
}
