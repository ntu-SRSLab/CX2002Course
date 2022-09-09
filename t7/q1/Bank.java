public class Bank {

  private CheckingAccount account;

  public double cashCheck(Check theCheck) {
    double amount = theCheck.getAmount();
    double balance = account.getBalance();

    // Important: in order for method to access account
    // means account is an instance variable of CheckingAccount class
    if (balance < amount) {
      account.addInsuffientFundFee();

      // note typo in diagram, have to follow diagram as it is common source for all
      account.noteReturnedCheck(theCheck);
      returnCheck(theCheck);

      return -1;
    }

    int checkNumber = theCheck.getCheckNumber();

    account.addDebitTransaction(checkNumber, amount);
    account.storePhotoOfCheck(theCheck);

    return amount;
  }

  private void returnCheck(Check theCheck) {

  }
}
