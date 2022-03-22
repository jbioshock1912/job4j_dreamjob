package core;

import java.util.Objects;

public class People {

    private int age;
    private String name;

    public People() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object other) {
        if(!super.equals(other)) return false;
        if (this == other) return true;
        if (other == null) return false;
        if(this.getClass() != other.getClass()) return false;
        People otherObj = (People) other;
        return this.age == otherObj.age && this.name == otherObj.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "age: " + age + "" +
                "\n" +
                "name: " + name;
    }
}
