import Enum.*;
import Exception.*;
public class ATMMachine {
    int total;
    int fiveHundred ;
    int twoHundred ;
    int oneHundred ;
    int fifteen ;
    int twenty ;
    int ten ;
    int five ;
    int two ;
    int one ;

    public ATMMachine(int fiveHundred, int twoHundred, int oneHundred, int fifteen, int twenty, int ten, int five, int two, int one) {
        this.fiveHundred = fiveHundred ;
        this.twoHundred = twoHundred ;
        this.oneHundred = oneHundred ;
        this.fifteen = fifteen ;
        this.twenty = twenty ;
        this.ten = ten ;
        this.five = five ;
        this.two = two ;
        this.one = one ;
        this.total = (fiveHundred * Bills.FIVEHUNDRED.getBill())+(twoHundred*Bills.TWOHUNDRED.getBill())+(oneHundred*Bills.ONEHUNDRED.getBill())+
                (fifteen*Bills.FIFTEEN.getBill())+(twenty*Bills.TWENTY.getBill())+(ten*Bills.TEN.getBill())+
                (five*Bills.FIVE.getBill())+(two*Coins.TWO.getCoin())+(one*Coins.ONE.getCoin());
    }

    public int getFiveHundred() {return fiveHundred;}

    public int getTwoHundred() {return twoHundred;}

    public int getOneHundred() {return oneHundred;}

    public int getFifteen() {return fifteen;}

    public int getTwenty() {return twenty;}

    public int getTen() {return ten;}

    public int getFive() {return five;}

    public int getTwo() {return two;}

    public int getOne() {return one;}

    public int[] getCash(int quantity){

        int[] quantityOfCash = new int [9];

        if(quantity>total){

            //new PrintMessage().getMessageInsufficientCash();
            throw new InsufficientMoneyException("The ATM machine has not enough money, please go to the nearest atm machine");

        }else{

            while(quantity>0){

                if(fiveHundred>0&&quantity>=Bills.FIVEHUNDRED.getBill()){
                    quantity=billsOfFiveHundred(quantity);
                    quantityOfCash[0]++;
                }else if(twoHundred>0&&quantity>=Bills.TWOHUNDRED.getBill()){
                    quantity=billsOfTwoHundred(quantity);
                    quantityOfCash[1]++;
                }else if(oneHundred>0&&quantity>=Bills.ONEHUNDRED.getBill()){
                    quantity= billsOfOneHundred(quantity);
                    quantityOfCash[2]++;
                }else if(fifteen>0&&quantity>=Bills.FIFTEEN.getBill()){
                    quantity= billsOfFifteen(quantity);
                    quantityOfCash[3]++;
                }else if(twenty>0&&quantity>=Bills.TWENTY.getBill()){
                    quantity= billsOfTwenty(quantity);
                    quantityOfCash[4]++;
                }else if(ten>0&&quantity>=Bills.TEN.getBill()){
                    quantity= billsOfTen(quantity);
                    quantityOfCash[5]++;
                }else if(five>0&&quantity>=Bills.FIVE.getBill()){
                    quantity= billsOfFive(quantity);
                    quantityOfCash[6]++;
                }else if(two>0&&quantity>=Coins.TWO.getCoin()){
                    quantity= coinsOfTwo(quantity);
                    quantityOfCash[7]++;
                }else if(one>0&&quantity>=Coins.ONE.getCoin()){
                    quantity= coinsOfOne(quantity);
                    quantityOfCash[8]++;
                }else if(quantity<0){
                    quantity=0;
                }

            }
        }
return quantityOfCash;
    }
    public int billsOfFiveHundred(int quantity){
        fiveHundred = fiveHundred - 1;
        return quantity - Bills.FIVEHUNDRED.getBill();

    }
    public int billsOfTwoHundred(int quantity){
        twoHundred=twoHundred-1;
        return quantity - Bills.TWOHUNDRED.getBill();

    }
    public int billsOfOneHundred(int quantity){
        oneHundred=oneHundred-1;
        return quantity - Bills.ONEHUNDRED.getBill();

    }
    public int billsOfFifteen(int quantity){
        fifteen=fifteen-1;
        return quantity - Bills.FIFTEEN.getBill();

    }
    public int billsOfTwenty(int quantity){
        twenty=twenty-1;
        return quantity - Bills.TWENTY.getBill();

    }
    public int billsOfTen(int quantity){
        ten=ten-1;
        return quantity - Bills.TEN.getBill();
    }
    public int billsOfFive(int quantity){
        five=five-1;
        return quantity - Bills.FIVE.getBill();
    }
    public int coinsOfTwo(int quantity){
        two=two-1;
        return quantity - Coins.TWO.getCoin();
    }
    public int coinsOfOne(int quantity){
        one=one-1;
        return quantity - Coins.ONE.getCoin();
    }

}