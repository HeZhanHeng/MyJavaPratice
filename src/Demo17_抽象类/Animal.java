package Demo17_抽象类;
/**
 * 抽象方法：加上abstract关键字，去掉大括号，直接分号结束
 * 抽象类：抽象方法所在的类，必须是抽象类才行。在class前加上abstract关键字即可。
 */
public abstract class Animal {
//    public void eat() {
//        System.out.println("吃鱼");//猫
//        System.out.println("吃骨头");//狗
////这里具体该吃什么，猫狗也不一样，所以需要换成抽象方法
//    }
    public abstract void eat();//抽象方法
    public abstract void sleep();
    public void normalMethod(){//普通成员方法

    }
}
