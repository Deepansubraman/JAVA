import java.util.*;
public class ArrayList {
    public static void main(String args[])
    {
        // add
        List<Integer> arr=new java.util.ArrayList<Integer>();
        arr.add(16);
        arr.add(13);
        arr.add(14);
        System.out.println("initial array: "+arr);
        arr.add(2,29);
        System.out.println("after add arr: "+arr);
        // addall
        System.out.print("arr1: ");
        List<Integer> arr1=List.of(12,23,34,14);
        System.out.println(arr1);
        arr.addAll(arr1);
        System.out.println("add arr1 to arr: "+arr);

        // remove
        arr.remove(3);
        System.out.println("remove: "+arr);
        arr.remove(Integer.valueOf(23));
        System.out.println("remove of 23: "+arr);


        // add
        for(int i=1;i<10;i++)
        {
            arr.add(i*10);
        }
        System.out.println("arr: "+arr);

        // contains
        System.out.println("List contains 40: "+arr.contains(40));
        // arr.clear();
        // isempty
        System.out.println("is empty: "+arr.isEmpty());
        // ascending sort
        Collections.sort(arr);
        System.out.println("Sorted list: " + arr);
        // decending sort
        arr.sort(Comparator.reverseOrder());
        System.out.println("Sorted Array in Descending Order: " + arr);
        // iterator
        Iterator<Integer> arr2=arr.iterator();
        while(arr2.hasNext())
        {
            int value=arr2.next();
            System.out.print(value);
        }
        // object
       Object[] array=arr.toArray();
       System.out.println("Converted to Array: ");
       for(Object obj:arr){
        System.out.print(obj +" ");
       }
       System.out.println();
       arr.clear();
       System.out.println("After Clearing the list: "+arr);
       System.out.println("list is "+arr.isEmpty());
    }
}
