package test;

public class Cat extends Animal implements Action {

    @Override
    public void toCall(String command) {
        System.out.println(command);
    }

    @Override
    public void getFood(Food food) {
        System.out.println("кошка ест" + food);
    }

    @Override
    public String getData() {
        return null;
    }
}
