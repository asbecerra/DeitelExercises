public class Client418 {
    private int accountNumber;
    private int amount;
    private int paymentAmount;
    private int totalCredits;
    private int creditLimit;

    public Client418(int accountNumber, int initialAmount){
        this.setAccountNumber(accountNumber);
        this.setAmount(initialAmount);
    }

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
    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    public int getPaymentAmount(){
        return paymentAmount;
    }
    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
    public int getTotalCredits(){
        return totalCredits;
    }
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public int newAmount() {
        int newAmount = amount + paymentAmount - totalCredits;
        return newAmount;
    }
    public boolean exceededCredit() {
        if (totalCredits > creditLimit) {
            return true;
        } else {
            return false;
        }
    }
}
