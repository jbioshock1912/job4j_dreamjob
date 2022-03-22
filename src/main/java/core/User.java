package core;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User> {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        User testOne = new User("julia", 45);
        User testTwo = new User("julia", 10);
        User tesThree = new User("slava", 15);
        User testFour = new User("kamik", 21);
        User testFive = new User("camilla", 10);
        User testSix = new User("slava", 200);
        User testSeven = new User("julia", 200);
        User testEight = new User("nina", 150);
        User testNine = new User("tonya", 7);
        User testTen = new User("angel", 32);

        Set<User> allUsers = new TreeSet<>();
        allUsers.add(testOne);
        allUsers.add(testTwo);
        allUsers.add(tesThree);
        allUsers.add(testEight);
        allUsers.add(testTen);
        allUsers.add(testSix);
        allUsers.add(testSeven);
        allUsers.add(testNine);
        allUsers.add(testFive);
        allUsers.add(testFour);
        System.out.println(allUsers);
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User user) {
        return this.age - user.age;
    }
}
