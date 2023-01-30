package Lesson19;

import java.util.ArrayList;

public class ArrayListExercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(20);
        arr.add(5);
        arr.add(8);

        //METHODS:
        maxNumber(arr);
        minNumber(arr);
        //Integer max = Collections.max(arr);
    }

    public static void maxNumber(ArrayList<Integer> arr) {

        int s = arr.size(); //store size of arraylist in "s"
        int max = arr.get(0); //first element is stored in "min" and "max"

        for (int i = 0; i < s; i++) { //to iterate
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println("Maximum number is : " + max);
    }

    public static void minNumber(ArrayList<Integer> arr){
        int s = arr.size();
        int min = arr.get(0);

        for (int i = 1; i < s; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        System.out.println("Minimum number is : " + min);
    }



}
