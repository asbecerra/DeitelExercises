import java.util.Scanner;

public class Exercise_4_18_Main {
        public static void main (String[] args){

            Scanner enter = new Scanner(System.in);
            int accountNumber;
            int amount;
            int paymentAmount;
            int totalCredits;
            int creditLimit;

            System.out.println("Client Account Number: ");
            accountNumber = enter.nextInt();
            System.out.println("Client Initial amount: ");
            amount = enter.nextInt();
            System.out.println("Client Payment amount: ");
            paymentAmount = enter.nextInt();
            System.out.println("Client total Credit: ");
            totalCredits = enter.nextInt();
            System.out.println("Client Credit Limit: ");
            creditLimit = enter.nextInt();

            Client418 client = new Client418(accountNumber, amount);
            client.setPaymentAmount(paymentAmount);
            client.setTotalCredits(totalCredits);
            client.setCreditLimit(creditLimit);

            System.out.printf("The new amount is: %d\n",client.newAmount());

                if (client.exceededCredit()) {
                    System.out.println("The credit limit has been got exceeded");
                } else  {
                    System.out.println("The credit limit has not been got exceeded");
                }
    }
}
