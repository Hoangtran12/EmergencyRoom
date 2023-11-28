import java.util.Comparator;
import java.util.Random;

public class HeapDemo {
        Comparator<Integer> naturalOrder = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };}
