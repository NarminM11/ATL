package Lesson19;

import java.util.Comparator;

public class Persons  implements Comparator {
    private String name;
    private String lastName;
    private Long age;
    private Integer id;

    public Long getAge(){
        return age;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
