import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumFinder<T extends Comparable<T>> {
    private T[] values;

    // Parameterized constructor for multiple values
    @SafeVarargs
    public MaximumFinder(T... values) {
        this.values = values;
    }

    // Static generic method to find the maximum of multiple values
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided");
        }

        // Convert the array to a list and sort it
        List<T> valueList = Arrays.asList(values);
        Collections.sort(valueList);

        // The maximum value will be the last element after sorting
        T max = valueList.get(valueList.size() - 1);

        // Print the maximum using the printMax method
        printMax(values, max);

        return max;
    }

    // Generic method to print the maximum value
    public static <T> void printMax(T[] values, T max) {
        System.out.println("The maximum of " + Arrays.toString(values) + " is: " + max);
    }

    // Instance method to find the maximum using the stored array
    public T testMaximum() {
        return testMaximum(values);
    }

    public static void main(String[] args) {
        // Test with Integers
        System.out.println("Find Maximum of Multiple Integers");
        testMaximum(3, 2, 1, 5, 4);

        // Test with Floats
        System.out.println("\nFind Maximum of Multiple Floats");
        testMaximum(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);

        // Test with Strings
        System.out.println("\nFind Maximum of Multiple Strings");
        testMaximum("Apple", "Peach", "Banana", "Mango", "Cherry");

        // Test with MaximumFinder Instance
        System.out.println("\nUsing MaximumFinder Instance");
        MaximumFinder<Integer> intFinder = new MaximumFinder<>(1, 2, 3, 4, 5);
        intFinder.testMaximum();
    }
}
