package Enum;

public enum Enum02 {

    PLUS,
    MINUS,
    DEVIDE,
    MULTYPLY,;

    int calculate(int a, int b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case DEVIDE:
                return a / b;
            case MULTYPLY:
                return a * b;
            default:
                throw new AssertionError("wrong " + this);
        }
    }
}
