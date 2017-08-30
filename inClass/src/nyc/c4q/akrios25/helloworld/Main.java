package nyc.c4q.akrios25.helloworld;

public class Main {

    public static void main(String[] args) {
	Apple myApple = new Apple();
	Apple adamsApple = new Apple();
	Apple yourApple = new Apple();
        //System.out.println("hello world");
        //all apples are orange if Apple.java
        yourApple.name = "Pink Lady";
        yourApple.seedCount = 22;
        yourApple.isRipe = false;

        adamsApple.name = "Empire";
        adamsApple.seedCount = 13;
        adamsApple.isRipe = true;

        myApple.seedCount = 10;
        myApple.isRipe = true;
        myApple.name = "Granny Smith";

        System.out.println("My apple is a " + myApple.name + " apple. It has " + myApple.seedCount + " seeds. " + "Is my apple ripe? " + myApple.isRipe );
        System.out.println("Your apple is a " + yourApple.name + " apple. It has " + yourApple.seedCount + " seeds. " + "Is your apple ripe? " + yourApple.isRipe );
        System.out.println("Adam's apple is an " + adamsApple.name + " apple. It has " + adamsApple.seedCount + " seeds. " + "Is adam's apple ripe? " + adamsApple.isRipe );


        Orange bloodOrange = new Orange(" ");
        //System.out.println(bloodOrange.setName());
        bloodOrange.setName("blood orange");
        bloodOrange.setSize(8);
         System.out.println("my orange is a " + bloodOrange.getName() + " and the size of my orange is " + bloodOrange.getSize());
    }
}
