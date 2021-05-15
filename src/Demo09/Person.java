package Demo09;

public class Person {
    static {
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("我是构造方法");
    }
}
