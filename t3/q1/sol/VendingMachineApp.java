public class VendingMachineApp
{
  public static void main(String[] args) {
    double drCost=0;
    double amtInserted = 0.0;

    VendingMachine vM = new VendingMachine();
    drCost = vM.selectDrink();
    amtInserted = vM.insertCoins(drCost);
    vM.checkChange(amtInserted,drCost);
    vM.printReceipt();
  }
}
