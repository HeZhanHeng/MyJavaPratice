package Demo17_抽象类;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫是吃鱼的");
    }

    @Override
    public void sleep() {
        System.out.println("猫咪白天睡觉");
    }
}
