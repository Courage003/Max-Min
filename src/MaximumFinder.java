import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MaximumFinder<T extends Comparable<T>> {
    private T[] values;

    //Parameterized constructor for multiple values
    @SafeVarargs
    public MaximumFinder(T... values) {
        this.values=values;

    }

    //Generic method to find the maximum of three values
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided.");
        }

        //Convert the array to a list and sort it
        List<T> valueList = Arrays.asList(values);
        Collections.sort(valueList);

        //The maximum value will be the last element after sorting
        return valueList.get(valueList.size() - 1);
    }


    // Instance method to call the static testMaximum method using instance variables
    public T testMaximum() {
        return testMaximum(values);
    }

    public static void main(String[] args) {
        // Test with more than three Integers
        System.out.println("Find Maximum of Multiple Integers");
        System.out.println("Maximum: " + testMaximum(3, 2, 1, 5, 4));

        // Test with more than three Floats
        System.out.println("\nFind Maximum of Multiple Floats");
        System.out.println("Maximum: " + testMaximum(1.1f, 2.2f, 3.3f, 4.4f, 5.5f));

        // Test with more than three Strings
        System.out.println("\nFind Maximum of Multiple Strings");
        System.out.println("Maximum: " + testMaximum("Apple", "Peach", "Banana", "Mango", "Cherry"));

        // Test with an instance of MaximumFinder
        System.out.println("\nUsing MaximumFinder Instance");
        MaximumFinder<Integer> intFinder = new MaximumFinder<>(1, 2, 3, 4, 5);
        System.out.println("Maximum: " + intFinder.testMaximum());
    }
}
