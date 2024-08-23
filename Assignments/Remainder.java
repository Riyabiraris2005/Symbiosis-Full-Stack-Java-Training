package student;

public class remainder{
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int quotient = dividend / divisor;
        int remainder = dividend - (quotient * divisor);
        System.out.println("The remainder is: " + remainder);
    }
}
