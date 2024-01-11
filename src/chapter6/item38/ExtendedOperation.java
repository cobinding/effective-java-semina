package chapter6.item38;

// 이런식으로 enum을 인터페이스로 확장 가능
// 연산을 구현할 때 좋은 방식
public enum ExtendedOperation implements Operation {
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("%") {
        public double apply(double x, double y) { return x / y;}
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
}
