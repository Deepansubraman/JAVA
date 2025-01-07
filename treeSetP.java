import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class treeSetP {
    public static void main(String[] args) {
        TreeSet<Integer> treeset=new TreeSet<>();
        treeset.add(10);
        treeset.add(20);
        treeset.add(30);
        treeset.add(15);
        treeset.add(5);
        System.out.println("Original TreeSet: "+treeset);
        System.out.println("First element:"+treeset.first());
        System.out.println("Last element:"+treeset.last());
        System.out.println("ceiling of 16: "+treeset.ceiling(16));
        System.out.println("Floor of 16: "+treeset.floor(16));
        System.out.println("Higher than 15: "+treeset.higher(15));
        System.out.println("Lower than 15:"+treeset.lower(15));
        System.out.println("HeadSet(less than 15): "+treeset.headSet(15));
        System.out.println("TailSet(greater than or equal 15): "+treeset.tailSet(15));
        System.out.println("SubSet : "+treeset.subSet(10,30));
        System.out.println("PollFirst (removes first): "+treeset.pollFirst());
        System.out.println("Treeset after pollFirst: "+treeset);
        System.out.println("PollLast (removes last): "+treeset.pollLast());
        System.out.println("Treeset after lastFirst: "+treeset);
        // General methods
        System.out.println("Size of TreeSet: " + treeset.size()); // Output: 3
        System.out.println("Does TreeSet contain 15? " + treeset.contains(15)); // Output: true
        System.out.println("Is TreeSet empty? " + treeset.isEmpty()); // Output: false

        // Add all elements from another collection
        List<Integer> additionalElements = Arrays.asList(25, 35, 40);
        treeset.addAll(additionalElements);
        System.out.println("TreeSet after adding collection: " + treeset); // Output: [10, 15, 20, 25, 35, 40]

        // Iteration
        System.out.println("Iterating over TreeSet:");
        for (Integer element : treeset) {
            System.out.print(element + " "); // Output: 10 15 20 25 35 40
        }
        System.out.println();

        // Convert to Array
        Object[] array = treeset.toArray();
        System.out.println("Array from TreeSet: " + Arrays.toString(array)); // Output: [10, 15, 20, 25, 35, 40]

        // Clear TreeSet
        treeset.clear();
        System.out.println("TreeSet after clearing: " + treeset); // Output: []
    }
}