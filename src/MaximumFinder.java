public class MaximumFinder {
    // Generic method to find the maximum of three values
    public static <T extends Comparable<T>> T testMaximum(T v1, T v2, T v3){
        T max=v1;
        //Assuming v1 is the maximum

        if(v2.compareTo(max)>0){
            max=v2;
        }
        if(v3.compareTo(max)>0){
            max=v3;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println("Find Maximum of Three Integers");
        System.out.println("Maximum: " + testMaximum(3, 2, 1)); // Integer test case
        System.out.println("Maximum: " + testMaximum(1, 3, 2));
        System.out.println("Maximum: " + testMaximum(1, 2, 3));

        System.out.println("\nFind Maximum of Three Floats");
        System.out.println("Maximum: " + testMaximum(3.3f, 2.2f, 1.1f)); // Float test case
        System.out.println("Maximum: " + testMaximum(1.1f, 3.3f, 2.2f));
        System.out.println("Maximum: " + testMaximum(1.1f, 2.2f, 3.3f));

        System.out.println("\nFind Maximum of Three Strings");
        System.out.println("Maximum: " + testMaximum("Apple", "Peach", "Banana")); // String test case
        System.out.println("Maximum: " + testMaximum("Banana", "Apple", "Peach"));
        System.out.println("Maximum: " + testMaximum("Peach", "Banana", "Apple"));
    }
}
