public class Bank {

  private CheckingAccount account;

  public double cashCheck(Check theCheck) {
    
    double amount = theCheck.getAmount();

    // Important: in order for method to access account means account is an
    // instance variable of CheckingAccount class
    double balance = account.getBalance();

    if (balance < amount) {
      account.addInsufficientFundFee();
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
