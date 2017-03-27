package org.rnovak.euler;


import java.util.Set;
import java.util.TreeSet;

public class Three implements Solution {

    private long VALUE = 600851475143L;

    public Three() {}

    private boolean isPrime(int n) {
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) if (n % i == 0) return false;
        return true;
    }

    public Number solve() {

        int sqrt = (int)Math.sqrt(VALUE) - 1;

        while (sqrt > 2) {
            if (VALUE % sqrt == 0 && isPrime(sqrt)) return sqrt;
            sqrt--;
        }

        return 0;
    }

}
