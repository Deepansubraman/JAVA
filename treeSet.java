import java.util.*;

public class treeSet{
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(39);
        tree.add(87);
        tree.add(10);
        tree.add(90);
        tree.add(4);
        System.out.println("The TreeSet is : "+tree);
        System.out.println("The first element : "+tree.first());
        System.out.println("The last element is : "+tree.last());
        System.out.println("The ceiling of 16 : "+tree.ceiling(16));
        System.out.println("The floor of 16 : "+tree.floor(16));
        System.out.println("The highest of the 16 : "+tree.higher(16));
        System.out.println("The lower of the 16 : "+tree.lower(16));
        System.out.println("The headSet of 16 is : "+tree.headSet(16));
        System.out.println("The tailSet of 16 : "+tree.tailSet(16));
        System.out.println("The subSet of the set is : "+tree.subSet(10,50));
    }
}