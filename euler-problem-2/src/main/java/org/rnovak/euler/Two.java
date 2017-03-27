package org.rnovak.euler;


public class Two implements Solution {


    public Number solve() {
        long sum = 0;

        int i = 1, j = 1;

        while (j < 4000000) {
            int tmp = i + j;
            i = j;
            j = tmp;
            if (j % 2 == 0) sum += j;
        }

        return sum;
    }

}
