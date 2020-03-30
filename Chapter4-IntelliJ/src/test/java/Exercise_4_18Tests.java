import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class Exercise_4_18Tests {
    @Test
    public void testClientCreation() {
        int accountNumber = 5678;
        int initialAmount = 87650;

        Client418 client = new Client418(accountNumber, initialAmount);
        assertEquals(client.getAccountNumber(), accountNumber);
        assertEquals(client.getAmount(), initialAmount);

        assertNotNull(client);
    }
}
