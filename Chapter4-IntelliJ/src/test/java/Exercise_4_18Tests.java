import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class Exercise_4_18Tests {
    int accountNumber = 5678;
    int initialAmount = 87650;

    @Test
    public void testClientCreation() {
        Client418 client = new Client418(accountNumber, initialAmount);
        assertEquals(client.getAccountNumber(), accountNumber);
        assertEquals(client.getAmount(), initialAmount);

        assertNotNull(client);
    }
    @Test
    public void testClientPayment(){
        int paymentAmount = 4567;
        Client418 client = new Client418(accountNumber,initialAmount);
        client.setPaymentAmount(paymentAmount);
        assertEquals(client.getPaymentAmount(), paymentAmount);
    }
    @Test
    public void testTotalCredits(){
        int totalCredits = 6789;
        Client418 client = new Client418(accountNumber, initialAmount);
        client.setTotalCredits(totalCredits);
        assertEquals(client.getTotalCredits(), totalCredits);
    }
    @Test
    public void testCreditLimit(){
        int creditLimit = 8790;
        Client418 client = new Client418(accountNumber, initialAmount);
        client.setCreditLimit(creditLimit);
        assertEquals(client.getCreditLimit(),creditLimit);
    }
    @Test
    public void testNewAmount(){
        int totalCredit = 4567;
        int paymentAmount = 123;
        int expectedAmount = initialAmount + paymentAmount - totalCredit;
        Client418 client = new Client418(accountNumber, initialAmount);
        client.setTotalCredits(totalCredit);
        client.setPaymentAmount(paymentAmount);
        assertEquals(client.newAmount(), expectedAmount);
    }
    @Test
    public void testCreditLimiteExceeded(){
        int creditLimit = 8876;
        int totalCredit = 9765;
        Client418 client = new Client418(accountNumber, initialAmount);
        client.setTotalCredits(totalCredit);
        client.setCreditLimit(creditLimit);
        assertEquals(client.exceededCredit(), true);
    }
}
