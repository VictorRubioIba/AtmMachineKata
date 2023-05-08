import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillsAndCoinsTest {

    ATMMachine atmMachine;
    PrintMessage printMessage;

    @BeforeEach
    public void beforeEach(){
        this.atmMachine= new ATMMachine(2,3,5,12,20,50,100,250,500);
        this.printMessage= new PrintMessage();
        atmMachine.getCash(1725);
    }

    @Test
    @DisplayName("Test for check the bills of 500")
    public void testCheckBillsOfFiveHundredEquals0(){
        int billsFiveHundredExpected = atmMachine.getFiveHundred();
        int billsFiveHundredActual = 0;
        assertEquals(billsFiveHundredExpected,billsFiveHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 200")
    public void testCheckBillsOfTwoHundredEquals0(){
        int billsTwoHundredExpected = atmMachine.getTwoHundred();
        int billsTwoHundredActual = 0;
        assertEquals(billsTwoHundredExpected,billsTwoHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 100")
    public void testCheckBillsOfOneHundredEquals0(){
        int billsOneHundredExpected = atmMachine.getOneHundred();
        int billsOneHundredActual = 4;
        assertEquals(billsOneHundredExpected,billsOneHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 50")
    public void testCheckBillsOfFifTeenEquals0(){
        int billsFifTeenExpected = atmMachine.getFifteen();
        int billsFifTeenActual = 12;
        assertEquals(billsFifTeenExpected,billsFifTeenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 20")
    public void testCheckBillsOfTwentyEquals0(){
        int billsTwentyExpected = atmMachine.getTwenty();
        int billsTwentyActual = 19;
        assertEquals(billsTwentyExpected,billsTwentyActual);
    }
    @Test
    @DisplayName("Test for check the bills of 10")
    public void testCheckBillsOfTenEquals0(){
        int billsTenExpected = atmMachine.getTen();
        int billsTenActual = 50;
        assertEquals(billsTenExpected,billsTenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 5")
    public void testCheckBillsOfFiveEquals0(){
        int billsFiveExpected = atmMachine.getFive();
        int billsFiveActual = 99;
        assertEquals(billsFiveExpected,billsFiveActual);
    }
    @Test
    @DisplayName("Test for check the coins of 2")
    public void testCheckCoinsOftwoEquals0(){
        int coinsTwoExpected = atmMachine.getTwo();
        int coinsTwoActual = 250;
        assertEquals(coinsTwoExpected,coinsTwoActual);
    }
    @Test
    @DisplayName("Test for check the coins of 1")
    public void testCheckCoinsOfOneEquals0(){
        int coinsOneExpected = atmMachine.getOne();
        int coinsOneActual = 500;
        assertEquals(coinsOneExpected,coinsOneActual);
    }
}
