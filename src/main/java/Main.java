public class Main {
    public static void main(String[] args) {
        PrintMessage printMessage = new PrintMessage();
        ATM atm = new ATM();

        printMessage.setInputMessage();
        atm.withdraw(printMessage.getQuantity());
    }
}
