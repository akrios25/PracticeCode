package nyc.c4q;

public class Main {

    String name = "Mainclass";
    static String staticName = "Static name";
    int size = 1200;

    public static void main(String[] args) {
    Main m = new Main();   //this creates an instance of main
    m.size = 1600;
    Main m2 = new Main();
    m2.name = "m2 name";
    m.name = "m1 name";
        //int resultSum  = sum(4,5);
    //int resultMul = mul(4, 6);
    //int resultDiv = div(32, 12);
                                     //this is a new instance of type Main called m
        System.out.println(m.sum(4,5)); //m is a method call to it's instance which allows for this to run
        System.out.println(Main.staticName + " " + m.name + " " + m2.name);
        System.out.println();
        //  System.out.println(resultMul);
      //  System.out.println(resultDiv);
       // Main m5; //m5 is null
        //System.out.println("m5: " +m5.name);



       int[] numbers = new int[] {1,2,3,4,5}; //this creates an array of int type
        System.out.println(m.sum(numbers));
        Main[] someMains = new Main[4];
        int counter = 1;
        for (Main _m: someMains){
            _m = new Main();
            _m.name = "main n:" + counter++;
        }
        for(Main _m: someMains){
            _m = new Main();
            System.out.println(_m.name);
        }
    }
      int sum(int a, int b) {
        return a + b;
    }
     static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    int sum(int[] nums){
        int result = 0;
        for(int n: nums)
            result += n; //for every number, you add the number to the result
        return result;
    }

}
