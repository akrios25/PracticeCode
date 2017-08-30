package nyc.c4q.kevintoro;
import java.util.*;

public class SmartList<T> extends ArrayList<T> {

    public SmartList(T... vargs) {
        for(T t: vargs)
            super.add(t);

    }
    <T> void add(T... args) {
        for(T t: args)
            add(t);
    }

}
