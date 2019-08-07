package ro.itschool.mvnbase.curs19.searching;

import java.util.Arrays;

public class BinarySearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null || elems.length==0) {
            return false;
        }
        if (elems[elems.length / 2] == elem) {
            return true;
        } else if (elems[elems.length / 2] < elem) {
            return search(Arrays.copyOfRange(elems, elems.length / 2 + 1, elems.length), elem);
        } else {
            return search(Arrays.copyOfRange(elems, 0, elems.length / 2), elem);
        }
    }
}
