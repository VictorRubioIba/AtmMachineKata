public class ATM implements ATMInterface{

    @Override
    public String withdraw(int quantity) {
        PrintMessage printMessage = new PrintMessage();
        ATMMachine atmMachine = new ATMMachine(2,3,5,12,20,50,100,250,500);

        // print quantity of bills or coins necessaries for quantity of user needs
        printMessage.getActualQuantityOfCashExtracted(atmMachine.getCash(quantity));
        // print actual situation of machine
        printMessage.getActualAtmMachineSituation(atmMachine.getFiveHundred(), atmMachine.getTwoHundred(), atmMachine.getOneHundred(), atmMachine.getFifteen(), atmMachine.getTwenty(), atmMachine.getTen(), atmMachine.getFive(), atmMachine.getTwo(), atmMachine.getOne());

        return null;
    }
}
