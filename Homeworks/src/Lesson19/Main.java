package Lesson19;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
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

        Iterator<String> iterator = arrayList.iterator();

        //boolean same = true;
        while(iterator.hasNext()){
            if(!iterator.next().equals(iterator)){
                //       same = false;
                break;
            }
        }
        //System.out.println(same);
    }
}
