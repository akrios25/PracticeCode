package nyc.c4q.kevintoro;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String testStr = "my string";
        int number = 154;
        Integer[] numArray = {5,6,7,8,9};
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("new string");
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");

        print("str:", len(testStr), "number: ", "double: ", len(2.45), len(number), "array:", len(numArray), "list:", len(list),
                "Hash Map: ", len(hs));

        SmartList<String> sList = new SmartList<>();

        ArrayList<String> al = new ArrayList<>();
        al.add("an item");

        LinkedList<String> ll = new LinkedList<>();
        ll.add("a linked item");

        print("A string", ll, al, 2, true);
//    print(al);
//    print("string");
//    }
//    public static void print(Object s){  //reference Generics notes
//        System.out.println(s);
    }
//     static <E> void print(E s) { //E is a type parameter, or a place holder for a type!! Reference G-notes
//        System.out.println(s);
//    }
    static <T> void print(T... args) { //the vargs(...variable arguments) here allows you to pass in x amount of elements
        String allTogether = " ";
        for(T o: args)
            allTogether += o  + " ";
        System.out.println(allTogether);
    }
    static int len(String s) {
         return s.length();
    }
    static int len(String[] array) {
        return array.length;
    }
    static int len(List<String> list) {
        return list.size();
    }
    static int len(double number) {
        return len(number + " ");
    }
    static <E> int len(E[] array) {
        return array.length;
    }
    static <T> int len(Collection<T> list ) {
        return list.size();
    }

//    public static void print(List<String> al) {
//        System.out.println(al);
//    }

//    public interface car {
//        int speed();
//        String name();
//    }
}
