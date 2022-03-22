package core;

public abstract class Animal {

    public Animal(String type) {
        System.out.println("абстрактный класс" + type);
    }

    public abstract void print();

    protected void printVoice() {
        System.out.println("testing");
    }


}
