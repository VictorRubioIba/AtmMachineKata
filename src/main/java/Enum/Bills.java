package Enum;

public enum Bills {
    FIVEHUNDRED(500),
    TWOHUNDRED(200),
    ONEHUNDRED(100),
    FIFTEEN(50),
    TWENTY(20),
    TEN(10),
    FIVE(5);

    private final int bill;
    Bills(int bill) {
        this.bill=bill;
    }

    public int getBill() {
        return bill;
    }


}
