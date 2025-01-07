import java.util.*;
public class set 
{
    public static void main(String[] args) 
    {
        Set<Integer> arr=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        // ADD
        System.out.println("Enter No of values to insert: ");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
            arr.add(sc.nextInt());
        }
        // ITERATION
        System.out.println("Using Iteration: ");
        Iterator it=arr.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.print("\n");
        System.out.println("Enter the element to remove: ");
        // REMOVE
        int remove=sc.nextInt();
        arr.remove(remove);
        System.out.println(arr);
        // REMOVE ALL
        System.out.println("enter the no of element to remove: ");
        Set<Integer> arr1=new HashSet<>();
        int no1=sc.nextInt();
        for(int i=0;i<no1;i++)
        {
            arr1.add(sc.nextInt());
        }
        System.out.println("removed set: ");
        arr.removeAll(arr1);
        Iterator it1=arr.iterator();
        while(it1.hasNext())
        {
            System.out.print(it1.next()+" ");
        }
        System.out.print("\n");

        // retainall
        Set<Integer> arr2=new HashSet<>();
        System.out.println("Enter No of values to insert another set: ");
        int no2=sc.nextInt();
        for(int i=0;i<no2;i++)
        {
            arr2.add(sc.nextInt());
        }
        arr.retainAll(arr2);
        System.out.println("The set after using retainAll : "+arr);
        // size
        System.out.println("The size of the set is : "+arr.size());
        // clear
        arr.clear();
        System.out.println("The set after clearing : "+arr);
        // object
        Object[] array = arr.toArray();
        System.out.print("The array from set : ");
        for(Object obj:array)
        {
            System.out.print(obj+" ");
        }
        System.out.println(" ");
        //contains 
        System.out.println("If it contains 54 : "+arr.contains(54));
    }
}

