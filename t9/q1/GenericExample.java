public class GenericExample {

  public static <T> void printArray(T[] array) {

    for (T element : array) {
      System.out.print(element + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    String[] strArray = {"Hello", "World"};
    Double[] doubleArray = {1.1, 2.2, 3.3};

    int[] primitiveArray = {1, 2, 3};
    
    printArray(intArray); // Output: 1 2 3 4 5
    printArray(strArray); // Output: Hello World
    printArray(doubleArray); // Output: 1.1 2.2 3.3

    // printArray(primitiveArray);
  }
}
