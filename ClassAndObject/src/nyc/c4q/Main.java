package nyc.c4q;

public class Main {

    public static void main(String[] args) {

		Car myCar = new Car();
	    Car c = new Car();

		myCar.setName("Mercedes");
		myCar.setType("Sedan");
		myCar.setCost( 10000);

	    c.setName("Mitsubishi");
		c.setCost(130000);
		c.setType("Truck");

		//System.out.println("my car is a" + myCar.getName() +" It is a"+ myCar.getType() + " and it cost $" + myCar.getCost());
		System.out.println(myCar.toString());
		System.out.println(c.toString());
		//abstract getType();
    }
}
