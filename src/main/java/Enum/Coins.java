package Enum;

public enum Coins {

    TWO(2),
    ONE(1);


    private final int coin;
    Coins(int coin) {
        this.coin=coin;
    }

    public int getCoin() {
        return coin;
    }
}
