package nyc.c4q.kevintoro;

public class Cat extends HouseHoldAnimals {

    Cat() {
        name = "cat";
    }
    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public void eat() {

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

