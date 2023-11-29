package controller;

import model.InsertionSorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Testing my algorytm
 */
public class SortingLauncher {
    public static void main(String[] args) {
        InsertionSorting insertionSorting = new InsertionSorting();

        Integer[] array = {9, 7, 3, 13, 1, 0, 8, 15, 2};
        List<Integer> list = new ArrayList<>(List.of(array));
        System.out.println(list);

        insertionSorting.insertionSort(list);
        System.out.println(list);
    }
}
