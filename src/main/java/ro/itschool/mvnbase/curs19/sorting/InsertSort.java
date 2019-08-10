package ro.itschool.mvnbase.curs19.sorting;

import java.util.Arrays;

public class InsertSort implements SortingAlgo {
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        for (int i = 1; i < elems.length; ++i) {
            int key = elems[i];
            int j = i - 1;

            while (j >= 0 && elems[j] > key) {
                elems[j + 1] = elems[j];
                j--;
            }
            elems[j + 1] = key;
        }
        return elems;
    }
}
