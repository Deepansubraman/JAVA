import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setprogramDifference {
    
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in set 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of elements in set 2 : ");
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            set1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            set2.add(sc.nextInt());
        }
        set1.retainAll(set2);
        System.out.println("The Intersection of set1 and set2 is : "+set1);
    }
}
