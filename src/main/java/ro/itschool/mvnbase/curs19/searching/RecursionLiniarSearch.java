package ro.itschool.mvnbase.curs19.searching;

import java.util.Arrays;

public class RecursionLiniarSearch implements SearchAlgo {

    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null || elems.length == 0) {
            return false;
        } else if (elems[0] == elem) {
            return true;
        } else {
            return search(Arrays.copyOfRange(elems, 1, elems.length), elem);
        }
    }
}
