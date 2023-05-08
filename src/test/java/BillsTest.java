import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BillsTest {
    ATMMachine atmMachine;
    PrintMessage printMessage;

    @BeforeEach
    public void beforeEach(){
        this.atmMachine= new ATMMachine(2,3,5,12,20,50,100,250,500);
        this.printMessage= new PrintMessage();
    }

    @Test
    @DisplayName("Test for check the bills of 500")
    public void testCheckBillsOfFiveHundredEquals0(){

        atmMachine.getCash(1000);
        int billsFiveHundredExpected = atmMachine.getFiveHundred();
        int billsFiveHundredActual = 0;
        assertEquals(billsFiveHundredExpected,billsFiveHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 500")
    public void testCheckBillsOfFiveHundredEquals1(){

        atmMachine.getCash(750);
        int billsFiveHundredExpected = atmMachine.getFiveHundred();
        int billsFiveHundredActual = 1;
        assertEquals(billsFiveHundredExpected,billsFiveHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 200")
    public void testCheckBillsOfTwoHundredEquals0(){

        atmMachine.getCash(1600);
        int billsTwoHundredExpected = atmMachine.getTwoHundred();
        int billsTwoHundredActual = 0;
        assertEquals(billsTwoHundredExpected,billsTwoHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 200")
    public void testCheckBillsOfTwoHundredEquals1(){

        atmMachine.getCash(1445);
        int billsTwoHundredExpected = atmMachine.getTwoHundred();
        int billsTwoHundredActual = 1;
        assertEquals(billsTwoHundredExpected,billsTwoHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 100")
    public void testCheckBillsOfOneHundredEquals0(){

        atmMachine.getCash(2100);
        int billsOneHundredExpected = atmMachine.getOneHundred();
        int billsOneHundredActual = 0;
        assertEquals(billsOneHundredExpected,billsOneHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 100")
    public void testCheckBillsOfOneHundredEquals1(){

        atmMachine.getCash(2000);
        int billsOneHundredExpected = atmMachine.getOneHundred();
        int billsOneHundredActual = 1;
        assertEquals(billsOneHundredExpected,billsOneHundredActual);
    }
    @Test
    @DisplayName("Test for check the bills of 50")
    public void testCheckBillsOfFifTeenEquals0(){

        atmMachine.getCash(2700);
        int billsFifTeenExpected = atmMachine.getFifteen();
        int billsFifTeenActual = 0;
        assertEquals(billsFifTeenExpected,billsFifTeenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 50")
    public void testCheckBillsOfFiTeenEquals1(){

        atmMachine.getCash(2650);
        int billsFifTeenExpected = atmMachine.getFifteen();
        int billsFifTeenActual = 1;
        assertEquals(billsFifTeenExpected,billsFifTeenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 20")
    public void testCheckBillsOfTwentyEquals0(){

        atmMachine.getCash(3100);
        int billsTwentyExpected = atmMachine.getTwenty();
        int billsTwentyActual = 0;
        assertEquals(billsTwentyExpected,billsTwentyActual);
    }
    @Test
    @DisplayName("Test for check the bills of 20")
    public void testCheckBillsOfTwentyEquals1(){

        atmMachine.getCash(3080);
        int billsTwentyExpected = atmMachine.getTwenty();
        int billsTwentyActual = 1;
        assertEquals(billsTwentyExpected,billsTwentyActual);
    }
    @Test
    @DisplayName("Test for check the bills of 10")
    public void testCheckBillsOfTenEquals0(){

        atmMachine.getCash(3600);
        int billsTenExpected = atmMachine.getTen();
        int billsTenActual = 0;
        assertEquals(billsTenExpected,billsTenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 10")
    public void testCheckBillsOfTenEquals1(){

        atmMachine.getCash(3590);
        int billsTenExpected = atmMachine.getTen();
        int billsTenActual = 1;
        assertEquals(billsTenExpected,billsTenActual);
    }
    @Test
    @DisplayName("Test for check the bills of 5")
    public void testCheckBillsOfFiveEquals0(){

        atmMachine.getCash(4100);
        int billsFiveExpected = atmMachine.getFive();
        int billsFiveActual = 0;
        assertEquals(billsFiveExpected,billsFiveActual);
    }
    @Test
    @DisplayName("Test for check the bills of 5")
    public void testCheckBillsOfFiveEquals1(){

        atmMachine.getCash(4095);
        int billsFiveExpected = atmMachine.getFive();
        int billsFiveActual = 1;
        assertEquals(billsFiveExpected,billsFiveActual);
    }

}
