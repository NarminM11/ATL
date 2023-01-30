package Lesson19;

import java.util.*;

public class ArrayListExercises {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Orange");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Green");
        arrayList.add("Purple");
        arrayList.add("Purple");

        //METHODS:
        duplicateElement(arrayList);
        //numbersofOfDuplicated(arrayList);
    }

    public static void duplicateElement(ArrayList<String> arrayList) {
        // bu Arraylistde duplicte elementleri tapin (additional duplicatelerin sayini da tapin)

        //the best ways is that first convert list to Set because it does not allow duplicates elements unlike arraylist.
        Set<String> set = new HashSet<String>(); //Create a HashSet from this ArrayList.

        set.addAll(arrayList); //add elements of "arraylist" to "set"

        arrayList.clear();//clear "list"
        arrayList.addAll(set); //add elements of "set" to "arraylist"

        for (String colors : arrayList) { //arrayListin her bir elementini goturur ve "colours"a menimsedir
            if (set.add(colors) == false) {//if add() method returns "false", then it means that this element isn't allowed in Set. Here, this element will be our duplicate element
                System.out.println(colors + " " + "is duplicated");
            }
        }
    }

    public static void numbersofOfDuplicated(ArrayList<String> arrayList) {

        //it wasn't counting the number properly when didn't rewrite it
        /*arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Blue");
        arrayList.add("Orange");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Black");
        arrayList.add("Green");
        arrayList.add("Purple");
        arrayList.add("Purple");
*/

        int duplicatedRed = Collections.frequency(arrayList, "Red");
        System.out.println(duplicatedRed);

        int duplicatedBlue = Collections.frequency(arrayList, "Blue");
        System.out.println(duplicatedBlue);

        int duplicatedOrange = Collections.frequency(arrayList, "Orange");
        System.out.println(duplicatedOrange);

        int duplicatedBlack = Collections.frequency(arrayList, "Black");
        System.out.println(duplicatedBlack);

        int duplicatedGreen= Collections.frequency(arrayList, "Green");
        System.out.println(duplicatedGreen);

        int duplicatedPurple = Collections.frequency(arrayList, "Purple");
        System.out.println(duplicatedPurple);

        int finalresult = duplicatedRed + duplicatedBlue + duplicatedOrange + duplicatedBlack + duplicatedGreen + duplicatedPurple;
        System.out.println(finalresult);
    }


}
