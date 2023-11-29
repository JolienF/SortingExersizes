package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Getting a better understanding of insertion sorting
 */
public class InsertionSorting {

    public void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {

            for (int j = i; j > 0; j--) {

                Integer number = list.get(j);
                Integer prevNumber = list.get(j - 1);
                if (number < prevNumber) {
                    list.set(j, prevNumber);
                    list.set(j - 1, number);

                } else {
                    break;
                }
            }
        }
    }
}
