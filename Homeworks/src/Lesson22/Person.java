package Lesson22;

import java.util.Comparator;

public class Person implements Comparator {

    private String address;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Person(String address, int age) {
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
