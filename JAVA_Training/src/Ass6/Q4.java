package Ass6;

import java.time.LocalDate;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        //this solution is using singly linked list and doesnt allow to traverse in reverse order
        //in order to achieve that we should implement doubly linked list
        LinkedList<LocalDate> BirthDates = new LinkedList<>();
        BirthDates.add(LocalDate.of(2010,4,23));
        BirthDates.add(LocalDate.of(2011,9,03));
        BirthDates.add(LocalDate.of(2021,1,13));
        BirthDates.add(LocalDate.of(2020,12,14));
        BirthDates.add(LocalDate.of(1999,7,14));
        //System.out.println(BirthDates);
        for (LocalDate d:BirthDates)
        {
            if(d.isLeapYear())
                System.out.println(d+" is a leap year...! \n");
            else
                System.out.println(d+" is not a leap year...!");

        }
    }
}
