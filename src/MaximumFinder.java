public class MaximumFinder<T extends Comparable<T>> {
    private T v1;
    private T v2;
    private T v3;

    public MaximumFinder(T v1, T v2, T v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //Static Generic method to find the maximum of three values
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

    // Instance method to call the static testMaximum method using instance variables
    public T testMaximum() {
        return testMaximum(v1, v2, v3);
    }

    public static void main(String[] args){
        // Test with Integers
        System.out.println("Find Maximum of Three Integers");
        MaximumFinder<Integer> intFinder = new MaximumFinder<>(3, 2, 1);
        System.out.println("Maximum: " + intFinder.testMaximum());

        // Test with Floats
        System.out.println("\nFind Maximum of Three Floats");
        MaximumFinder<Float> floatFinder = new MaximumFinder<>(3.3f, 2.2f, 1.1f);
        System.out.println("Maximum: " + floatFinder.testMaximum());

        // Test with Strings
        System.out.println("\nFind Maximum of Three Strings");
        MaximumFinder<String> stringFinder = new MaximumFinder<>("Apple", "Peach", "Banana");
        System.out.println("Maximum: " + stringFinder.testMaximum());
    }
}
