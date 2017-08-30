package nyc.c4q.kevintoro;

import java.util.ArrayList;
import java.util.HashMap;
class Main {

    public static void main(String[] args) {
        //String myString = "morning";
        //int i = 0;
        int[] array = {34, 7, 6, 42, 0}; //elements added by your choice
        int[] array2 = new int[9]; //maximum length placed

        //System.out.println(array[4]);
        //System.out.println(array2[1]); //default value of every value is 0
        //WHEN CREATING AN ARRAY OF A PRIMITIVE TYPE, IT EQUATES TO 0
        //array2[1] = 31;
        //System.out.println(array2[1]);
        int[] oldArray = array2;
        array2 = new int[10];
        for(int i = 0; i < array2.length; i++){
            array2[i] = i * 5;
            System.out.println(array2[i]);
        }
        for(int i = 0; i < oldArray.length; i++){
            array2[i] = i * 5;
            array2[i] = oldArray[i];
            //System.out.println(array2[i]);
            //to assign inside an array without assigning every value
            //you use array2[i] = i * 5;
            //this reassigns every value throughout your array, specified with whatever increment or number
            //you'd want
        }
        array2[9] = 99;
        System.out.println();
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println("you are here now\n");
        String[] myString = new String[10];

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println(integerArrayList.size());
        integerArrayList.add(6);
        System.out.println(integerArrayList.size());
        System.out.println(integerArrayList.get(0));
        System.out.println("\n");

        ArrayList<Integer> newArrayList = new ArrayList<>();
        System.out.println(newArrayList.size());
        newArrayList.add(25);
        newArrayList.add(30);
        newArrayList.add(75);
        newArrayList.add(100);
        System.out.println(newArrayList.size());
        System.out.println(newArrayList.get(1));
        for(int i = 0; i < newArrayList.size(); i++){
            System.out.println(newArrayList.get(i));
        }

        HashMap<Integer, String> importantBirthdays = new HashMap<>();
        //ArrayList<Integer> myArray = new ArrayList<>();

        importantBirthdays.put(18, "you can now vote");
        importantBirthdays.put(21, "you can now drink");
        importantBirthdays.put(65, "you can now retire");

        System.out.println(importantBirthdays.get(21));
        System.out.println(importantBirthdays.size());

        System.out.println(importantBirthdays.containsKey(21));//checks through

        ArrayList<String> hairBands = new ArrayList<>();
        hairBands.add("Poison");
        hairBands.add("Ratt");
        hairBands.add("Quiet Riot");
        hairBands.add("Van Halen");
         //Array review: cannot be changed
        //String[] myString = {"husky", "labrador","greyhound"};
        System.out.println(myString.length);
        String lab = myString[1];
        System.out.println(lab);
        myString[2] = "great dane";
        System.out.println(myString[2]);
         //ArrayList: can be changed
        ArrayList<String> dogs = new ArrayList<>(5);//<-- no arguments constructor, starts at 0, can be used for initial size
        dogs.add("husky");
        //mutt goes here /everything gets pushed over by one when using insertion
        dogs.add("labrador");
        dogs.add("great dane");

        String husky = dogs.get(0);
        System.out.println(husky);

        String labra = dogs.get(1);
        System.out.println(labra);

        //add in arraylist has the ability to indicate index and the value you want placed there
        dogs.add(1,"mutt");
        System.out.println(dogs.get(1));
        //do this to check for containment         //does dogs contain husky? t || f?
            System.out.println("contains husky " + (dogs.contains("husky")));
            System.out.println("index of pomeranian = " + dogs.indexOf("pomeranian"));
            //line above returns an invalid index, -1, because it does not have pomeranian
        System.out.println(dogs.get(dogs.size() - 1)); //prints the last element of an arraylist


         //key/value pairs ...if keys are not unique, they will override
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("husky", "looks like wolf");
        dictionary.put("pomeranian", " is fluff");
        dictionary.put("great dane", "is huge");

        System.out.println(dictionary.get("husky"));
        System.out.println("wolf");
        for(String dog : dictionary.keySet()) {               //pass in the key to print out values
            System.out.println("Key is " + dog + ". value is " + dictionary.get(dog));
        }   //dog prints out the values associated with the key, dog is reassigned as key in the for each loop

        dictionary.put("chihuahua", " is obnoxious");
        System.out.println(dictionary.get("chihuahua"));
        dictionary.remove("chihuahua");
        System.out.println(dictionary.get("chihuahua"));

        //ABSTRACT CLASSES
        //class definition you don't want to directly instantiate




//        for (String band : hairBands) { //for every string that has a band, print the band?
//            System.out.println(band);
//        }



        HashMap<String, String> animalFoods = new HashMap<>();
        animalFoods.put("chipmunks", "seeds");
        animalFoods.put("squirrels", "acorns");
        animalFoods.put("bats", "mosquitoes");
        animalFoods.put("park pigeons", "human souls");










        for (String animal : animalFoods.keySet()){
            System.out.println(animalFoods.get(animal));//for every animal that's used as a key in the key set






        }
        //myArray.add();

//        for (int i = 0; i < 16; i++) {
//            // i++;
//            myArray.add(i);
//            System.out.println(myArray);
//            System.out.println(myArray.get(i));
//        }
            //ArrayList<Character> myCharray = new ArrayList<>();

//            for (int i = 65; i < 86; i++) {
//
//                myCharray.add((char)i);
//                System.out.println(myCharray.get(myCharray.size() -1));
//
//                System.out.println(containsChar(myCharray, 'A'));
//
//            }

    }
    //ABSTRACT CLASSES
    static abstract class Furniture {
        public abstract int getLegCount();
    }
    static class Chair extends Furniture{

        @Override
        public int getLegCount() {
            return 4;
        }

    }
    static class BarStool extends Furniture {

        @Override
        public int getLegCount() {
            return 3;
        }
    }
    interface IDog {
        void bark();
    }
    interface Shedder {
        void shed();
    }
    class AustralianShepherd implements IDog, Shedder {

        @Override
        public void bark() {

        }

        @Override
        public void shed() {

        }
    }
//    public static boolean containsChar (ArrayList<Character> thing, Character someletter){
//
//      return thing.contains(someletter);
//    }
}
