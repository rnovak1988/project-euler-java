package org.rnovak.euler;


public class EulerRunner {

    static Class[] SOLUTIONS = new Class[] {
        org.rnovak.euler.One.class,
        org.rnovak.euler.Two.class,
        org.rnovak.euler.Three.class
    };

    public static void main (String[] args) throws InstantiationException,IllegalAccessException {

        for (Class<?> classz : SOLUTIONS) {
            Solution solution = Solution.class.cast(classz.newInstance());
            System.out.println(String.format("Solution for problem %s is %s", solution.getClass().getName(), solution.solve().toString()));
        }

    }


}
