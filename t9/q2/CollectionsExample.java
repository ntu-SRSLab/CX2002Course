import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 1);

    // Sort in descending order
    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println("Sorted in descending order: " + numbers);

    // Shuffle the list
    Collections.shuffle(numbers);
    System.out.println("Shuffled list: " + numbers);

    // Find max and min
    System.out.println("Max: " + Collections.max(numbers));
    System.out.println("Min: " + Collections.min(numbers));
  }
}
