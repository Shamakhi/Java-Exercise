public class IntObject implements MyInteger {
    private int number;

    public void isEven() {
        if (number%2==0) System.out.println("It's Even");
        else System.out.println("It isn't Even");
    }


    public void isOdd() {
        if (number%2!=0) System.out.println("It's Odd");
        else System.out.println("It isn't Odd");
    }
else if

    public void isPositive() {
        if (number>=0) System.out.println("It's Positive");
        else System.out.println("It isn't Positive");
    }


    public void isNegative() {
        if (number<=0) System.out.println("It's Negative");
        else System.out.println("It isn't Negative");
    }


    public void isZero() {
        if (number==0) System.out.println("It's Zero");
        else System.out.println("It isn't Zero");
    }

    IntObject(int number){
        this.number=number;
    }
}
