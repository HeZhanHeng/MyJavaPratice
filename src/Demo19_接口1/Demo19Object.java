package Demo19_接口1;

public class Demo19Object implements Demo19Interface {
    @Override
    public void methodA() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是第2个方法");
    }

    @Override
    public void methodC() {
        System.out.println("这是第3个方法");
    }

    @Override
    public void methodD() {
        System.out.println("这是第4个方法");
    }
}
