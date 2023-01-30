package Lesson19;

import java.util.*;

public class HashSetExercise {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        //add elements in hashset
        numbers.add(2);
        numbers.add(6);

        //METHODS:
        //addMethod(numbers);
        //convertToArrayList(numbers);
        //convertToLinkedList(numbers);
        //toArray(numbers);
        //convertToTreeSet(numbers);
        //union(numbers);
        //clearMethod(numbers);
        //treeSet(numbers);
        //getNumberOfElements(numbers);
        //compare(numbers);
        firstElement(numbers);
        lastElement(numbers);


    }

    public static void addMethod(HashSet<Integer> numbers) {
        //Write a Java program to add element to the hash set
        numbers.add(8);
        System.out.println("Updated version: " + numbers);

    }

    public static void convertToArrayList(HashSet<Integer> numbers) {
        //Write a Java program to convert a hash set to a ArrayList
        List<Integer> array = new ArrayList<>(numbers);

        System.out.println("ArrayList's elements: " + array);
    }

    public static void convertToLinkedList(HashSet<Integer> numbers) {
        //Write a Java program to convert a hash set to a LinkedList
        List<Integer> linked = new LinkedList<>(numbers);

        System.out.println("LinkedList's elements: " + linked);
    }

    public static void toArray(HashSet<Integer> numbers) {
        //The toArray() method of List interface returns an array containing all the elements present in the list in proper order.
        //HashSet<Integer> numbers = new HashSet<>();

        //create new int type array
        //this array's size is the same as hashset
        /* alınmayan solution --> int [] arr = new int[numbers.size()];
        numbers.toArray(); //convert hashset to an array
        //print elements of array
        System.out.print("Array: ");
        for (int item : arr) {
            System.out.print(item + ", ");
           }*/


        Object[] n = numbers.toArray();
        System.out.println();
        for(int i = 0 ;i < n.length;i++){
            System.out.println(n[i]);
        }
        //ArrayStoreException- If the runtime type of the specified array is not a supertype of the runtime type of every element in this list.
    }

    public static void convertToTreeSet(HashSet<Integer> numbers){
        //Write a Java program to convert a hash set to a tree set
        Set<Integer> tree = new TreeSet<>(numbers);
        System.out.println("TreeSet's elements: " + tree);
    }

    public static void union(HashSet<Integer> numbers){
        // Write a Java program to compare two sets and retain elements which are same on both sets

        //creating another hashset class
        HashSet<Integer> numbers2 = new HashSet<>();

        //elements of numbers2 set
        numbers2.add(3);
        numbers2.add(6);
        numbers2.add(2);

        //union of two sets
        numbers2.addAll(numbers);
        System.out.println("Union is: " + numbers2);
    }

    public static void clearMethod(HashSet<Integer> numbers){
        //Write a Java program to remove all the elements from a hash set
        numbers.clear();
        System.out.println(numbers);
    }

    public static void treeSet(HashSet<Integer> numbers) {
        //Write a Java program to create a new tree set, add some colors (string) and print out the tree set
        Set<String> tree2 = new TreeSet<>();


        //add some colors
        tree2.add("Green");
        tree2.add("Blue");
        tree2.add("Yellow");
        tree2.add("Red");

        System.out.println(tree2);

        Iterator<String> iterate = tree2.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + ", ");
        }
    }

    public static void getNumberOfElements(HashSet<Integer> numbers){
        //Write a Java program to get the number of elements in a tree set
        Set<String> tree2 = new TreeSet<>();

        //add some colours
        tree2.add("Green");
        tree2.add("Blue");
        tree2.add("Yellow");
        tree2.add("Red");

        int size = tree2.size();
        System.out.println(size);
    }

    public static void compare(HashSet<Integer> numbers){
        //Write a Java program to compare two tree sets
        TreeSet<Integer> tree2 = new TreeSet<>();

        //add
        tree2.add(3);
        tree2.add(6);
        tree2.add(9);
        tree2.add(1);

        TreeSet<Integer> tree1 = new TreeSet<>();
        tree1.add(3);
        tree1.add(5);
        tree1.add(6);
        tree1.add(7);

        boolean compared  = numbers.equals(tree2);
        System.out.println("Are both set equal: " + compared);
    }

    public static void  firstElement(HashSet<Integer> numbers){
        //Write a Java program to retrieve and remove the first element of a tree set
        TreeSet<Integer> tree2 = new TreeSet<>();

        //add
        tree2.add(3);
        tree2.add(6);
        tree2.add(9);
        tree2.add(1);

        int removedNumber = tree2.pollFirst();
        System.out.println(removedNumber);


    }

    public static void lastElement(HashSet<Integer> numbers){
//Write a Java program to retrieve and remove the last element of a tree set
        TreeSet<Integer> tree2 = new TreeSet<>();

        //add
        tree2.add(3);
        tree2.add(6);
        tree2.add(9);
        tree2.add(1);
        int removedNumber = tree2.pollLast();
        System.out.println(removedNumber);
    }

}