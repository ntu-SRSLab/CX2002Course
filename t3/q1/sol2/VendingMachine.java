import java.util.Scanner;

public class VendingMachine {
  Drink[] drinks; // Object composition - relevant
  double drinkCost = 0.0;
  int drinkSelection = 0;

  public VendingMachine() {
    drinks = new Drink[3]; // future improvement can just read from file or DB
    drinks[0] = new Drink("Beer", 3.00) ;
    drinks[1] = new Drink("Coke", 1.00) ;
    drinks[2] = new Drink("Green Tea", 5.00) ;
    // Future improvement to add 'quantity'
  }

  public void start() {
    // All drinkCost can be removed since the instance attribute holds the value
    // The rest of the methods can be declared as private
    // VendingMachine should know how it works.
    drinkCost = selectDrink();
    double amt = insertCoins(drinkCost);
    checkChange(amt,drinkCost);
    printReceipt();
  }

  public double selectDrink() {
    Scanner sc = new Scanner(System.in);

    System.out.println("====== Vending Machine ======");
    for (int i = 0 ; i < drinks.length ; i++)
      System.out.println("|" + (i+1) + " Buy " + drinks[i].getName() +
                         String.format("  %.2f  ", drinks[i].getCost()) + "  |");
    System.out.println("|============================");

    do {
      System.out.println("Please enter selection: ");
      drinkSelection = sc.nextInt();
    } while (drinkSelection < 1 || drinkSelection > 3);

    drinkCost = drinks[drinkSelection-1].getCost() ;
    return drinkCost;
  }

  public double insertCoins (double drinkCost) {
    double amount = 0.0;

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
      System.out.printf("Coins inserted: $%.2f \n", amount);
    } while (amount < drinks[drinkSelection-1].getCost());

    return amount;
  }

  public void checkChange(double amt, double drinkCost) {
    double change=0.0;

    if (amt > drinkCost) {
      change = amt - drinkCost;
      // System.out.printf("Change: $ %.2f \n", change);
      System.out.println("Change : $" +  String.format("%.2f", change));
      // NumberFormat formatter = NumberFormat.getCurrencyInstance();
      // System.out.println(formatter.format(money));
    }
  }

  public void printReceipt() {
    System.out.println("Please collect your drink");
    System.out.println("Thank You !!");
  }
}
