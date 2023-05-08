
import java.util.Scanner;

public class PrintMessage {
    Scanner sc = new Scanner(System.in);
    public void setInputMessage(){
        System.out.println("How much money do you want?");
    }
    public int getQuantity(){

        try {
            return sc.nextInt();
        }catch (RuntimeException e){
            throw new RuntimeException("You must introduce a good value! ");
        }

    }

    public void getMessageInsufficientCash(){
        System.out.println( "The ATM machine has not enough money, please go to the nearest atm machine");

    }

    public void getActualAtmMachineSituation(int fiveHundred, int twoHundred, int oneHundred, int fifteen, int twenty, int ten, int five, int two, int one){

        System.out.println(" THE SITUATION OF ATMMACHINE IS;");

        System.out.println(" | Value | Type | Quantity of units | \n" +
                           " |-------|------|-------------------| ");
        System.out.format( " |  500  | bill |%-10s         | ",fiveHundred );
        System.out.println();
        System.out.format( " |  200  | bill |%-10s         | ",twoHundred );
        System.out.println();
        System.out.format( " |  100  | bill |%-10s         | ",oneHundred );
        System.out.println();
        System.out.format( " |   50  | bill |%-10s         | ",fifteen);
        System.out.println();
        System.out.format( " |   20  | bill |%-10s         | ",twenty );
        System.out.println();
        System.out.format( " |   10  | bill |%-10s         | ",ten);
        System.out.println();
        System.out.format( " |    5  | bill |%-10s         | ",five);
        System.out.println();
        System.out.format( " |    2  | coin |%-10s         | ",two);
        System.out.println();
        System.out.format( " |    1  | coin |%-10s         | ",one);
        System.out.println();

    }
    public void getActualQuantityOfCashExtracted(int [] quantityOfCash){


        if(quantityOfCash[0]>0){System.out.println(quantityOfCash[0] + " bills of 500.");}
        if(quantityOfCash[1]>0){System.out.println( quantityOfCash[1] + " bills of 200.");}
        if(quantityOfCash[2]>0){System.out.println( quantityOfCash[2] + " bills of 100.");}
        if(quantityOfCash[3]>0){System.out.println( quantityOfCash[3] + " bills of 50.");}
        if(quantityOfCash[4]>0){System.out.println( quantityOfCash[4] + " bills of 20.");}
        if(quantityOfCash[5]>0){System.out.println( quantityOfCash[5] + " bills of 10.");}
        if(quantityOfCash[6]>0){System.out.println( quantityOfCash[6] + " bills of 5.");}
        if(quantityOfCash[7]>0){System.out.println( quantityOfCash[7] + " coins of 2.");}
        if(quantityOfCash[8]>0){System.out.println( quantityOfCash[8] + " coins of 1.");}
        System.out.println();
        System.out.println();

    }
}
