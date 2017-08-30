package nyc.c4q;

public class Car {
    public String name;
    public int cost;
    public String type;

    public String getName() {
        return name;

    }
    public String getType() {
        return type;
    }
    public int getCost() {
        return cost;
    }

    public void setName(String newName) {
        name = newName;

    }

    public void setCost(int newCost) {
        cost = newCost;

    }
    public void setType(String newType) {
        type = newType;
    }

   public String toString() {
        return "My car is a " + getName() +". It is a " + getType() +". It cost me $" + getCost();
    }

}
