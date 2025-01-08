import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");
        treeMap.put(10, "Ten");
        System.out.println("TreeMap: " + treeMap);
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());
        System.out.println("Value for key 5: " + treeMap.get(5));
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);
        System.out.println("Contains key 10? " + treeMap.containsKey(10));
        System.out.println("Contains value 'Eight'? " + treeMap.containsValue("Eight"));
        System.out.println("Higher Key than 5: " + treeMap.higherKey(5));
        System.out.println("Lower Key than 5: " + treeMap.lowerKey(5));
        System.out.println("Ceiling Key for 6: " + treeMap.ceilingKey(6));
        System.out.println("Floor Key for 6: " + treeMap.floorKey(6));
        System.out.println("SubMap (from 3 to 8): " + treeMap.subMap(3, 8));
        System.out.println("HeadMap (less than 5): " + treeMap.headMap(5));
        System.out.println("TailMap (greater than or equal to 5): " + treeMap.tailMap(5));
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        treeMap.clear();
        System.out.println("After clearing, TreeMap is empty? " + treeMap.isEmpty());
    }
}