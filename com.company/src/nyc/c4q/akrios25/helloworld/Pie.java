package nyc.c4q.akrios25.helloworld;

public class Pie {
    private  String crust = "filo dough";
    private  String pieFilling = "cherry";
    private  int diameter = 12;

    public Pie () {
    this("filo dough ", "cherry " , 12);
    pieIsBaked();

    }

    public Pie(String chefChoiceCrust, String chefChoicePieFilling, int chefChoiceDiameter) {
        crust = chefChoiceCrust;
        pieFilling = chefChoicePieFilling;
        diameter = chefChoiceDiameter;
    }

    public String getCrust() {
        return crust;
    }

    public String getPieFilling() {
        return pieFilling;
    }

    public int getDiameter() {
        return diameter;
    }
    public void setCrust(String newCrust) {
        crust = newCrust;
    }
    public void setPieFilling(String newPieFilling) {
        pieFilling = newPieFilling;
    }
    public void setDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    public void pieIsBaked() {
        System.out.println("I am a " + pieFilling + " pie");
    }

}
