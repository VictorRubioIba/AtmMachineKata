import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Exception.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AtmMachineTest {



    ATMMachine atmMachine;
    PrintMessage printMessage;

    @BeforeEach
    public void beforeEach(){
       this.atmMachine= new ATMMachine(2,3,5,12,20,50,100,250,500);
       this.printMessage= new PrintMessage();

    }


    @Test
    @DisplayName("Test for check the if money its insufficient and call exception")
    public void testMoneyInsufficientInAtmMachine(){
        assertThrows(InsufficientMoneyException.class,()->{atmMachine.getCash(5101);});
    }

    @Test
    @DisplayName("Test for check the message when call exception")
    public void testCheckMessageOfInsuficientMoney(){
        Exception exception = assertThrows(InsufficientMoneyException.class,()->{atmMachine.getCash(5101);});
        String messageExpected = String.valueOf(exception.getMessage());
        String messageActual = "The ATM machine has not enough money, please go to the nearest atm machine";

        assertEquals(messageActual,messageExpected);
    }



}
