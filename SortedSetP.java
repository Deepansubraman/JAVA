import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetP {
    public static void main(String[] args) {
        SortedSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(15);
        set.add(30);
        System.out.println("Original SortedSet "+set);
        System.out.println("First element: "+set.first());
        System.out.println("Last Element: "+set.last());
        SortedSet<Integer> head=set.headSet(15);
        System.out.println("headset (less than 15): "+head);
        SortedSet<Integer> tail=set.tailSet(15);
        System.out.println("Taile Set (Element greater than or equal 15) : "+tail);
        SortedSet<Integer> subset=set.subSet(10,30);
        System.out.println("SubSet (10 to 30): "+subset);
    }
}