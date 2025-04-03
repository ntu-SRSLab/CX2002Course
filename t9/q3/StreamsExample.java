import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

  public static void main(String[] args) {

    List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
    List<String> result = words.stream()
      .filter(s -> s.length() >= 5) // Filter strings with length >= 5
      .map(String::toUpperCase) // Convert to uppercase
      .collect(Collectors.toList()); // Collect into a list
    
    System.out.println(result); // Output: [APPLE, BANANA, ORANGE]

    long count = words.stream().filter(s -> s.length() >= 5).count();
    System.out.println("Count: " + count);
  }
}
