public class Client418 {
    private int  accountNumber;
    private int amount;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public Client418(int accountNumber, int initialAmount){
        this.setAccountNumber(accountNumber);
        this.setAmount(initialAmount);

    }
}
