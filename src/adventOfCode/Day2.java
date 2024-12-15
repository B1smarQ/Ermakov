package adventOfCode;

import java.util.*;

public class Day2 {

    public boolean solution(List<Integer> list){
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.naturalOrder());
        List<Integer> reverseSortedList = new ArrayList<>(list);
        reverseSortedList.sort(Comparator.reverseOrder());
        if(sortedList == list || reverseSortedList == list){


        }
        return true;
    }
}
