package nyc.c4q;

public class MathFunctions {
    private int[] numArray = new int[0];

    public MathFunctions() {
    }
    public MathFunctions(int[] numArray) {
        this.numArray = numArray;
    }


    public static int add(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
    public int add() {
        return add(numArray);
    }
    public int subtract(int[] numbers) {
        int difference = 1;
        for(int i = 0; i < numbers.length; i++){
            difference = difference - numbers[i];
        }
        return difference;
    }
    public int mul(int[] numbers) {
        int product = 1;
        for(int i = 0; i < numbers.length; i++){
            product = product * numbers[i];
        }
        return product;
    }
    public int divide(int[] numbers) {
        int quotient = 1;
        for(int i = 0; i < numbers.length; i++){
            quotient = quotient / numbers[i];
        }
        return quotient;
    }
    public int average(int[] numbers) {
        int sum = add(numbers);
        int avg = sum / numbers.length;
        return avg;
    }
    public int max(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            if(current > max){
                max = current;
            }
        }
        return max;
    }
    public int min(int[] numbers) {
        return 0;
    }
    public int length(int[] array) {
        int counter = 0;
        for(int n: array) counter++;
        return counter;
    }

}
