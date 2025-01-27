public class Os {
    import java.util.Arrays;

public class SecondLargest {

    // Write a function to find the second largest element in the array
    public static int getSecondElement(int[] array) {
        // First sort the array
        Arrays.sort(array);
        // Return the second largest element
        return array[array.length - 2];
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 7, 98, 78, 69, 87};
        int secondLargest = getSecondElement(nums);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
}
