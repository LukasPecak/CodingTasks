package org.lukas.javach.task;

/**
 * Created by LPecak on 2016-06-08.
 * @author Lukas Pecak
 */
public class SortedArraysConcatenation {

    private SortedArraysConcatenation() {
    }

    public static SortedArraysConcatenation getInstance() {
        return new SortedArraysConcatenation();
    }

    public int[] concatenateArrays(int[] a, int[] b) {
        if (checkIfNullArrays(a, b)) {
            return someNullArrays(a, b);
        } else {
            return notNullArrays(a, b);
        }
    }

    private boolean checkIfNullArrays(int[] a, int[] b) {
        return a == null || b == null;
    }

    private int[] someNullArrays(int[] a, int[] b) {
        if (a == null && b == null) {
            return new int[0];
        }
        if (a == null) {
            return b;
        }
        return a;
    }

    private int[] notNullArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        if (i < a.length) {
            System.arraycopy(a, i, result, k, a.length - i);
        }
        if (j < b.length) {
            System.arraycopy(b, j, result, k, b.length - j);
        }
        return result;
    }
}
