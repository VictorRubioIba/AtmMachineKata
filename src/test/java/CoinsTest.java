import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinsTest {
    ATMMachine atmMachine;
    PrintMessage printMessage;

    @BeforeEach
    public void beforeEach(){
        this.atmMachine= new ATMMachine(2,3,5,12,20,50,100,250,500);
        this.printMessage= new PrintMessage();
    }

    @Test
    @DisplayName("Test for check the coins of 2")
    public void testCheckCoinsOfTwoEquals0(){

        atmMachine.getCash(4600);
        int coinsTwoExpected = atmMachine.getTwo();
        int coinsTwoActual = 0;
        assertEquals(coinsTwoExpected,coinsTwoActual);
    }
    @Test
    @DisplayName("Test for check the coins of 2")
    public void testCheckCoinsOfTwoEquals1(){

        atmMachine.getCash(4598);
        int coinsTwoExpected = atmMachine.getTwo();
        int coinsTwoActual = 1;
        assertEquals(coinsTwoExpected,coinsTwoActual);
    }
    @Test
    @DisplayName("Test for check the coins of 1")
    public void testCheckCoinsOfOneEquals0(){

        atmMachine.getCash(5100);
        int coinsOneExpected = atmMachine.getOne();
        int coinsOneActual = 0;
        assertEquals(coinsOneExpected,coinsOneActual);
    }
    @Test
    @DisplayName("Test for check the coins of 1")
    public void testCheckCoinsOfOneEquals1(){

        atmMachine.getCash(5099);
        int coinsOneExpected = atmMachine.getOne();
        int coinsOneActual = 1;
        assertEquals(coinsOneExpected,coinsOneActual);
    }
}
