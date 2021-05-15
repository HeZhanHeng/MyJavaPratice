package Demo17_抽象类;

/**
 * 抽象类的概念：如果父类当中的方法不确定如何进行方法体实现，那么这就应该是一个抽象方法。【不同图形的面积】
 * <p>
 * 如何使用抽象类和抽象方法：
 * 1，不能直接new抽象类对象
 * 2。必须用一个子类来继承抽象父类。
 * 3.子类必须覆盖重写父类当中所有的抽象方法
 * 4.创建子类对象去使用
 * <p>
 * 【注意】一个抽象类中不一定有抽象方法，但有抽象方法的类一定是抽象类
 */
public class Demo17 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
//        Dog dog=new Dog();//已经是抽象类了，不能被new
//        dog.eat();
        GoldenDog goldenDog = new GoldenDog();
        goldenDog.eat();
        goldenDog.sleep();
//        P169 发红包案例
    }
}
