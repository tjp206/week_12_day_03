public enum CoinType {

    OnePence(0.01),
    TwoPence(0.02),
    FivePence(0.05),
    TenPence(0.10),
    TwentyPence(0.20),
    FiftyPence(0.50),
    OnePound(1.00),
    TwoPound(2.00);


    private final Double value;

    CoinType(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
