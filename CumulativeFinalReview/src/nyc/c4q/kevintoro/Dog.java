package nyc.c4q.kevintoro;

public class Dog extends HouseHoldAnimals {
    private String name = "Dog";
    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public void eat() {

    }
    public void bark(){
        System.out.println("whoo whoo");
    }

    @Override
    public void sleep() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}
