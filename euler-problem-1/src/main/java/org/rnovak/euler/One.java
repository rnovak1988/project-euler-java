package org.rnovak.euler;


public class One implements Solution {

    private int limit = 1000; // Defined in https://projecteuler.net/problem=1

    public One() {}
    public One(int limit) {
        this.limit = limit;
    }

    public Number solve() {
        int result = 0;

        for (int i = 1; i < limit; i++) if (i % 3 == 0 || i % 5 == 0) result += i;

        return result;
    }

}
