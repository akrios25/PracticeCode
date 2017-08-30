package nyc.c4q;

public class Main {

    public static void main(String[] args) {
        print("hello world");
        print("is this working");
     MathFunctions mf = new MathFunctions();
     int[] numArray = {1, 2, 3, 4, 23, 48, 94 };
     //int sum = mf.add(numArray);
     //int difference = mf.subtract(numArray); if this is used, you'll print it as +difference
     //int quotient = mf.divide(numArray);
     //int product = mf.mul(numArray);
     //int average = mf.average(numArray);
     //int max = mf.max(numArray);
     MathFunctions mf2 = new MathFunctions();
     ScientificFunctions sf = new ScientificFunctions();

     print("sum is: " + mf.add(numArray));
     print("difference is: " + mf.subtract(numArray));
     print("quotient is: " + mf.divide(numArray));
     print("product is: " + mf.mul(numArray));
     print("the average is: " + mf.average(numArray));
     print("the max is: " + mf.max(numArray));
     print("mf2 is " + mf2.add(numArray));
    }
    public static String print(String name) {
            System.out.println(name);
            return null;
    }


}

