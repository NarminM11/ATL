package Lesson19;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {

        HashSet set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int counter =  0;
        for(int i = 0;i < n;i++){
            if(set.add(sc.nextLine())){
                counter++;
            }
            System.out.println(counter);
        }
    }
}