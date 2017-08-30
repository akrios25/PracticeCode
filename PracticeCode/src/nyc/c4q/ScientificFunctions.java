package nyc.c4q;

public class ScientificFunctions extends MathFunctions {
    public ScientificFunctions() {
        super();
    }
    public int sumOfSquares(int[] numArray) {
        int sum = add(numArray);
        int square = square(sum);
        return square;
    }

    private int square(int sum) {
        return sum * sum;
    }
}
