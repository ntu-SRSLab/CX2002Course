import java.util.Scanner;

public class DiceApp {
  public static void main(String[] args) {
    String once, twice;
    int total;
    int rollone, rolltwo;

    Scanner sc = new Scanner(System.in);
    System.out.println("Press <key> to roll the first dice");
    // once = sc.next();
    Dice d1 = new Dice();
    // d1.setDiceValue();
    rollone = d1.getDiceValue();
    d1.printDiceValue();

    System.out.println("Press <key> to roll second dice");
    // twice = sc.next();
    Dice d2 = new Dice();
    // d2.setDiceValue();
    rolltwo = d2.getDiceValue();
    d2.printDiceValue();

    total = rollone + rolltwo;
    System.out.println("Your total number is: " + total);
  }
}
