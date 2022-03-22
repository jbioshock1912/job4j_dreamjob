package core;

public class Dog extends Animal implements Action {

    public Dog() {
       super("psina");
        System.out.println("создание собаки псина");
    }

    public Dog(String type) {
        super(type);
        System.out.println("создание собаки с параметром");
    }

    @Override
    public void print() {
    }

    @Override
    public void makeDecision() {
        System.out.println("жрать");
    }

    public static void main(String[] args) {
        Dog dogOne = new Dog();
    }
}
