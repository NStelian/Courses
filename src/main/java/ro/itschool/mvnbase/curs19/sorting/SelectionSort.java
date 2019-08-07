package ro.itschool.mvnbase.curs19.sorting;

public class SelectionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }

        for (int i = 0; i < elems.length; i++) {
            int minPos=findMinPos(elems, i);
            swap(elems, i, minPos);
        }
        return elems;
    }

    private int findMinPos(int[] elems, int start) {
        int pos = start;
        for (int i = start; i < elems.length; i++) {
            if (elems[i] < elems[pos]) {
                pos = i;
            }
        }
        return pos;
    }
}
