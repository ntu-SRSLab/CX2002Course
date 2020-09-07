import java.util.Scanner;

public class VendingMachine {
  public VendingMachine() {}

  public double selectDrink() {
    Scanner sc = new Scanner(System.in);
    int drinkSelection;
    double drinkCost=0;
    System.out.println("====== Vending Machine ======");
    System.out.println("|1. Buy Beer ($3.00)        |");
    System.out.println("|2. Buy Coke ($1.00)        |");
    System.out.println("|3. Buy Green Tea ($5.00)   |");
    System.out.println("|============================");
    do {
      System.out.println("Please enter selection: ");
      drinkSelection = sc.nextInt();
    } while (drinkSelection < 1 || drinkSelection > 3);
    if (drinkSelection == 1)
      drinkCost = 3.00;
    else if (drinkSelection == 2)
      drinkCost = 1.00;
    else if (drinkSelection== 3)
      drinkCost = 5.00;
    return drinkCost;
  }

  public double insertCoins (double drinkCost) {
    double amount=0.0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please insert coins: ");
    System.out.println("========== Coins Input ===========");
    System.out.println("|Enter 'Q' for ten cents input   |");
    System.out.println("|Enter 'T' for twenty cents input|");
    System.out.println("|Enter 'F' for fifty cents input |");
    System.out.println("|Enter 'N' for a dollar input    |");
    System.out.println("==================================");
    do {
      char coin = sc.next().charAt(0);
      switch (coin) {
      case 'Q': case 'q':
        amount += 0.10;
        break;
      case 'T': case 't':
        amount += 0.20;
        break;
      case 'F': case 'f':
        amount += 0.50;
        break;
      case 'N': case 'n':
        amount += 1.00;
        break;
      }
      System.out.printf("Coins inserted: %.2f \n", amount);
    } while (amount < drinkCost);
    return amount;
  }

  public void checkChange(double amt, double drCost) {
    double change=0.0;
    if (amt > drCost) {
      change = amt - drCost;
      System.out.printf("Change: $ %.2f \n", change);
    }
  }

  public void printReceipt() {
    System.out.println("Please collect your drink");
    System.out.println("Thank You !!");
  }
}
