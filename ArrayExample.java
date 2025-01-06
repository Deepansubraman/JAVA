import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter No of values to append: ");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            System.out.println("enter the "+i+" value: ");
            arr.add(sc.nextInt());
        }


        System.out.println("enter value to delete: ");
        int b=sc.nextInt();
        arr.remove(Integer.valueOf(b));
        System.out.println("After delete: "+arr);

        System.out.println("enter No of index to delete: ");
        int c=sc.nextInt();
        arr.remove(c);
        System.out.println("After delete: "+arr);
    }
}
